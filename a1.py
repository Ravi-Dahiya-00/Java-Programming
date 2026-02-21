import time
from typing import Any, Dict, List, Optional

import pandas as pd
import requests


API_URL = "https://draw.ar-lottery01.com/WinGo/WinGo_30S/GetHistoryIssuePage.json"


def _first_list_of_dicts(obj: Any) -> Optional[List[Dict[str, Any]]]:
    if isinstance(obj, list) and obj and isinstance(obj[0], dict):
        return obj
    if isinstance(obj, dict):
        for value in obj.values():
            found = _first_list_of_dicts(value)
            if found:
                return found
    if isinstance(obj, list):
        for value in obj:
            found = _first_list_of_dicts(value)
            if found:
                return found
    return None


def fetch_history() -> Dict[str, Any]:
    ts_ms = int(time.time() * 1000)
    params = {"ts": ts_ms}
    headers = {
        "User-Agent": "Mozilla/5.0",
        "Accept": "application/json",
        "Referer": "https://draw.ar-lottery01.com/",
    }
    response = requests.get(API_URL, params=params, headers=headers, timeout=20)
    response.raise_for_status()
    return response.json()


def main() -> None:
    payload = fetch_history()

    records = _first_list_of_dicts(payload)
    if not records:
        raise RuntimeError("No list of records found in API response.")

    df = pd.json_normalize(records)
    df.to_csv("trend_data.csv", index=False)
    print("Finished. Total records saved:", len(df))


if __name__ == "__main__":
    main()

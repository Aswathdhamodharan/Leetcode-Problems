import pandas as pd

def modifySalaryColumn(employees: pd.DataFrame) -> pd.DataFrame:
    col = employees["salary"] * 2
    employees.drop("salary",axis=1)
    employees["salary"] = col
    return employees
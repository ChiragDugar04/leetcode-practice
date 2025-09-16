/* Write your T-SQL query statement below */
With t as (
    Select 
    p.email as Email,
    count(*) as count_email
    From Person p
    group by email
    having count(*) > 1
)
Select Email from t;
select user_id, Concat(upper(substring(name,1,1)),lower(substring(name,2))) as name
from users
order by user_id;
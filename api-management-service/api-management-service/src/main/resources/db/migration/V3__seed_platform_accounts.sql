INSERT INTO management_users (
    organization_id, role_id, username, password_hash, enabled, created_at, updated_at
)
SELECT NULL, roles.id, 'platform-admin',
       'eyJhbGciOiJIUzI1NiJ9.eyJSb2xlIjoiQWRtaW4iLCJJc3N1ZXIiOiJJc3N1ZXIiLCJVc2VybmFtZSI6IkphdmFJblVzZSIsImV4cCI6MTc5MDg1NDYwMiwiaWF0IjoxNzkwODU0NjAyfQ.nBtIlo3VCaPo9bF6lhEkqB4y1X_W9gZjjr8FfCODxMo
',
       TRUE, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP
FROM roles WHERE roles.name = 'PLATFORM_ADMIN';


INSERT INTO management_users (
    organization_id, role_id, username, password_hash, enabled, created_at, updated_at
)
SELECT NULL, roles.id, 'gateway-service',
       'eyJhbGciOiJIUzI1NiJ9.eyJSb2xlIjoiQWRtaW4iLCJJc3N1ZXIiOiJJc3N1ZXIiLCJVc2VybmFtZSI6IkphdmFJblVzZSIsImV4cCI6MTc5MDg1NDYwMiwiaWF0IjoxNzkwODU0NjAyfQ.nBtIlo3VCaPo9bF6lhEkqB4y1X_W9gZjjr8FfCODxMo
',
       TRUE, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP
FROM roles WHERE roles.name = 'GATEWAY_SERVICE';
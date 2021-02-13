CREATE TABLE property (
  id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  create_time VARCHAR,
  property_type VARCHAR,
  rent_price FLOAT NOT NULL,
  email_address VARCHAR,
  code VARCHAR
-- TODO: Add missing columns, indices, constraints
);

CREATE TABLE address (
  id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  street VARCHAR,
  city VARCHAR,
  us_state VARCHAR,
  zip VARCHAR,
  timezone VARCHAR
);

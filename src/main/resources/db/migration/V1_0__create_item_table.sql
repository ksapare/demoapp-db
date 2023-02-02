-- Table: item

CREATE TABLE item
(
    item_id INT NOT NULL,
    item_name VARCHAR(200) NOT NULL,
    item_category VARCHAR(200) NOT NULL,
    item_description VARCHAR(200) NOT NULL,
    item_price FLOAT NOT NULL,
    CONSTRAINT cid_pkey PRIMARY KEY (item_id)
)
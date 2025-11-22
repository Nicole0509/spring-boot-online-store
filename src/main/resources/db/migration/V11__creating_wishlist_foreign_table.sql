CREATE TABLE wishlist
(
    products_id BIGINT NOT NULL,
    users_id    BIGINT NOT NULL,
    CONSTRAINT pk_wishlist PRIMARY KEY (products_id, users_id)
);

ALTER TABLE wishlist
    ADD CONSTRAINT fk_wishlist_on_product FOREIGN KEY (products_id) REFERENCES products (id);

ALTER TABLE wishlist
    ADD CONSTRAINT fk_wishlist_on_user FOREIGN KEY (users_id) REFERENCES users (id);
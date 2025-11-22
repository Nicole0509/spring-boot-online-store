ALTER TABLE products
    DROP FOREIGN KEY products_users_id_fk;


alter table products
    add constraint fk_products_category
    foreign key (category_id)
    references categories(id)
    on delete restrict;


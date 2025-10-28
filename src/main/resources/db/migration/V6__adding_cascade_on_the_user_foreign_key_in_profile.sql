alter table profiles
    drop foreign key profiles_users_id_fk;

alter table profiles
    add constraint profiles_users_id_fk
        foreign key (id) references users (id)
            on update cascade on delete cascade;


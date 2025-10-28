create table profiles
(
    id            bigint        null,
    bio           varchar(255)  null,
    phone_number  varchar(20)   null,
    date_of_birth date          null,
    loyal_points  int default 0 null check ( loyal_points > 0 ),
    constraint profiles_users_id_fk
        foreign key (id) references users (id)
);


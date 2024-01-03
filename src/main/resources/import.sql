INSERT INTO tb_musics_list (name) VALUES ('Rock/Rap');
INSERT INTO tb_musics_list (name) VALUES ('Funk/Pop');

INSERT INTO tb_musics (nome, artista, ano_lancamento, genero, url_capa_album) VALUES ('Numb-Encore', 'Linkin Park', 2004, 'Rock', 'https://www.reddit.com/media?url=https%3A%2F%2Fi.redd.it%2F0kjzx89lp2t51.png');
INSERT INTO tb_musics (nome, artista, ano_lancamento, genero, url_capa_album) VALUES ('From The Inside', 'Linkin Park', 2002, 'Rock', 'https://www.reddit.com/media?url=https%3A%2F%2Fi.redd.it%2F0kjzx89lp2t51.png');
INSERT INTO tb_musics (nome, artista, ano_lancamento, genero, url_capa_album) VALUES ('Faint', 'Linkin Park', 2004, 'Rock', 'https://www.reddit.com/media?url=https%3A%2F%2Fi.redd.it%2F0kjzx89lp2t51.png');
INSERT INTO tb_musics (nome, artista, ano_lancamento, genero, url_capa_album) VALUES ('In The End', 'Linkin Park', 2000, 'Rock', 'https://www.reddit.com/media?url=https%3A%2F%2Fi.redd.it%2F93wpsqqu7d101.jpg');
INSERT INTO tb_musics (nome, artista, ano_lancamento, genero, url_capa_album) VALUES ('Shake It Off', 'Taylor Swift', 2014, 'Pop', 'https://www.reddit.com/media?url=https%3A%2F%2Fi.redd.it%2F1989-taylors-version-v0-hfi73audvvib1.png%3Fs%3D11ab759dbef1318fcb7a1149515aad82d2a811df');
INSERT INTO tb_musics (nome, artista, ano_lancamento, genero, url_capa_album) VALUES ('Halo', 'Beyoncé', 2008, 'Pop', 'https://www.reddit.com/media?url=https%3A%2F%2Fi.redd.it%2Ffbqdqj3htjq61.jpg');
INSERT INTO tb_musics (nome, artista, ano_lancamento, genero, url_capa_album) VALUES ('Single Ladies (Put a Ring on It)', 'Beyoncé', 2008, 'Pop', 'https://www.reddit.com/media?url=https%3A%2F%2Fpreview.redd.it%2Fthree-custom-i-am-sasha-fierce-album-covers-by-me-lemonade-v0-im4rn4cqvoc81.jpg%3Fwidth%3D640%26crop%3Dsmart%26auto%3Dwebp%26s%3Da6888591a1327b46550e13da2a744b59b8443ea3');
INSERT INTO tb_musics (nome, artista, ano_lancamento, genero, url_capa_album) VALUES ('Welcome to My Life', 'Simple Plan', 2004, 'Rock', 'https://upload.wikimedia.org/wikipedia/en/1/12/StillNotGettingAny.jpg');
INSERT INTO tb_musics (nome, artista, ano_lancamento, genero, url_capa_album) VALUES ('Perfect', 'Simple Plan', 2003, 'Rock', 'https://upload.wikimedia.org/wikipedia/en/1/12/StillNotGettingAny.jpg');
INSERT INTO tb_musics (nome, artista, ano_lancamento, genero, url_capa_album) VALUES ('Uptown Funk', 'Mark Ronson ft. Bruno Mars', 2014, 'Pop', 'https://upload.wikimedia.org/wikipedia/pt/7/77/Uptown_Funk.jpg');


INSERT INTO tb_related (lists_id, musics_id, position) VALUES (1, 1, 0);
INSERT INTO tb_related (lists_id, musics_id, position) VALUES (1, 2, 1);
INSERT INTO tb_related (lists_id, musics_id, position) VALUES (1, 3, 2);
INSERT INTO tb_related (lists_id, musics_id, position) VALUES (1, 4, 3);
INSERT INTO tb_related (lists_id, musics_id, position) VALUES (1, 5, 4);

INSERT INTO tb_related (lists_id, musics_id, position) VALUES (2, 6, 0);
INSERT INTO tb_related (lists_id, musics_id, position) VALUES (2, 7, 1);
INSERT INTO tb_related (lists_id, musics_id, position) VALUES (2, 8, 2);
INSERT INTO tb_related (lists_id, musics_id, position) VALUES (2, 9, 3);
INSERT INTO tb_related (lists_id, musics_id, position) VALUES (2, 10, 4);
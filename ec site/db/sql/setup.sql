create table ACCOUNT(
accountid VARCHAR(20)not null,
accountpw VARCHAR(100)not null,
accountname VARCHAR(100)not null,
accountmail VARCHAR(100)not null,
accountpostno VARCHAR(50)not null,
accountaddress VARCHAR(3000)not null,
phoneno VARCHAR(50)not null,

primary key (accountid )
);


INSERT INTO ACCOUNT VALUES
('AB1234','admin','山田太郎','yamadatarou@gmail.com','534-0024','東京墨田区江東橋1-1-1',08000001111);
INSERT INTO ACCOUNT VALUES
('AB4321','admin','小山太郎','koyama@gmail.com','534-0011','東京中野区高円寺1-1-1',08011112222);



create table CATEGORY(
categoryid VARCHAR(10) not null,
categoryname VARCHAR(100) not null,
primary key (categoryid )
);

INSERT INTO CATEGORY VALUES
('C00001','VEGETABLE');
INSERT INTO CATEGORY VALUES
('C00002','FRUIT');
INSERT INTO CATEGORY VALUES
('C00003','JUICE');


create table FOOD(
foodid VARCHAR(10)not null,
category_id VARCHAR(10)not null, 
foodkana VARCHAR(100)not null,
foodname VARCHAR(100)not null,
foodprice int not null,
comment VARCHAR(3000)not null,
foodpath VARCHAR(3000)not null,

primary key (foodid),

foreign key (category_id) references CATEGORY(categoryid )
    on update no action
    on delete no action

);

INSERT INTO FOOD VALUES
('AA000001','C00001','トマトとまと','トマト',80,'真っ赤でみずみずしい！','./img/products/tomato.jpg');
INSERT INTO FOOD VALUES
('AA000002','C00001','ナスなす茄子','ナス',80,'ふっくりきれいな！','./img/products/eggplant.jpg');
INSERT INTO FOOD VALUES
('AA000003','C00001','ピーマンぴーまん','ピーマン',80,'子供もおいしく食べれる！','./img/products/piman.jpg');
INSERT INTO FOOD VALUES
('AA000004','C00001','キュウリきゅうり','きゅうり',80,'サラダのお供に！',' ./img/products/cucamber.jpg');
INSERT INTO FOOD VALUES
('AA000005','C00001','ズッキーニずっきーに','ズッキーニ',600,'おうち時間はピクルスを作ろう',' ./img/products/picrus.jpg');
INSERT INTO FOOD VALUES
('AA000006','C00001','オクラおくら','オクラ',200,'夏バテにはねばねば！','./img/products/okra.jpg');
INSERT INTO FOOD VALUES
('AA000007','C00001','トウモロコシとうもろこし','とうもろこし',300,'茹でても焼いても美味しい！','./img/products/corn.jpg');
INSERT INTO FOOD VALUES
('AA000008','C00001','バジルばじる','バジル',800,'いつもの食事にひと手間工夫！','./img/products/basil.jpg');
INSERT INTO FOOD VALUES
('AA000009','C00001','シソしそ紫蘇','しそ',300,'手巻き寿司を作るあなたに！','./img/products/siso.jpg');
INSERT INTO FOOD VALUES
('AA000010','C00001','モロヘイヤもろへいや','モロヘイヤ',1500,'スムージーにお勧め','./img/products/moroheiya.jpg');
INSERT INTO FOOD VALUES
('AA000011','C00001','サヤエンドウさやえんどう','さやエンドウ',1000,'ぷちぷち触感がたまらない！','./img/products/endo.jpg');
INSERT INTO FOOD VALUES
('AA000012','C00001','ソラマメそらまめそら豆ソラ豆空まめ空マメ空豆蚕豆','そら豆',1000,'スーパーじゃ買えない！','./img/products/soramame.jpg');
INSERT INTO FOOD VALUES
('AA000013','C00001','エダマメえだまめえだ豆エダ豆枝まめ枝マメ枝豆','枝豆',150,'ビールのお供に','./img/products/edamame.jpg');
INSERT INTO FOOD VALUES
('AA000014','C00001','カボチャかぼちゃ南瓜','かぼちゃ',200,'BBQの定番！お子様も大好き','./img/products/pumpkin.jpg');
INSERT INTO FOOD VALUES
('AA000015','C00001','ニンジンにんじん人参','人参',90,'使い方たくさん！','./img/products/carrot.jpg');
INSERT INTO FOOD VALUES
('AA000016','C00001','ジャガイモじゃがいもじゃが芋ジャガ芋','ジャガイモ',80,'夏はじゃがバタ、冬はシチューに','./img/products/potato.jpg');
INSERT INTO FOOD VALUES
('AA000017','C00001','タマネギたまねぎ玉ねぎ玉ネギ玉葱','玉ねぎ',80,'サラダにも炒め物にも万能野菜','./img/products/onion.jpg');
INSERT INTO FOOD VALUES
('AA000018','C00001','ダイコンだいこん大根','大根',300,'甘くて美味しい','./img/products/daikon.jpg');
INSERT INTO FOOD VALUES
('AA000019','C00001','ネギねぎ葱','ネギ',100,'そばにはやっぱりネギ','./img/products/negi.jpg');
INSERT INTO FOOD VALUES
('AA000020','C00001','ゴボウごぼう牛蒡','ごぼう',200,'豚汁を食べたくなったあなたへ','./img/products/gobo.jpg');
INSERT INTO FOOD VALUES
('AA000021','C00001','サトイモさといも里いも里イモさと芋サト芋里芋','里芋',500,'煮物にはこれが一番！','./img/products/satoimo.jpg');
INSERT INTO FOOD VALUES
('AA000022','C00001','キャベツきゃべつ','キャベツ',200,'シャキシャキおいしい！','./img/products/cabbage.jpg');
INSERT INTO FOOD VALUES
('AA000023','C00001','レタスれたす','レタス',400,'ハンバーガーに挟んじゃおう！','./img/products/letace.jpg');
INSERT INTO FOOD VALUES
('AA000024','C00001','ハクサイはくさい白菜','白菜',300,'鍋にもってこい！','./img/products/hakusai.jpg');
INSERT INTO FOOD VALUES
('AA000025','C00001','ブロッコリーぶろっこりー','ブロッコリー',700,'マヨネーズ付けたら絶対おいしいよね','./img/products/burokkori.jpg');
INSERT INTO FOOD VALUES
('AA000026','C00001','ホウレンソウほうれんそうほうれん草ホウレン草法蓮草法連草','ほうれん草',600,'おひたしにどうぞ！','./img/products/spinach.jpg');
INSERT INTO FOOD VALUES
('AA000027','C00001','コマツナこまつな小松菜','小松菜',400,'おひたしにも、スムージーにも！','./img/products/komatsuna.jpg');
INSERT INTO FOOD VALUES
('AA000028','C00001','カブかぶ蕪','かぶ',1050,'うんとこしょ、どっこいしょ！','./img/products/kabu.jpg');
INSERT INTO FOOD VALUES
('AA000029','C00001','キセツノヤサイツメアワセセットきせつのやさいつめあわせせっと季節の野菜詰め合わせセット','季節の野菜詰め合わせセット',2500,'おいしい夏野菜がたっぷり！','./img/products/set.jpg');
INSERT INTO FOOD VALUES
('AA000030','C00002','リンゴりんご林檎','りんご',150,'果物といえばこれ！','./img/products/apple.jpg');
INSERT INTO FOOD VALUES
('AA000031','C00002','ナシなし梨','なし',150,'みずみずしくてジューシー','./img/products/nasi.jpg');
INSERT INTO FOOD VALUES
('AA000032','C00002','ブドウぶどう葡萄','ぶどう',500,'皮も食べれる種無し','./img/products/grape.jpg');
INSERT INTO FOOD VALUES
('AA000033','C00002','ミカンみかん蜜柑','みかん',90,'冬のお供に','./img/products/orange.jpg');
INSERT INTO FOOD VALUES
('AA000034','C00002','イチゴいちご苺','いちご',400,'女性に大人気！','./img/products/strawberry.jpg');
INSERT INTO FOOD VALUES
('AA000035','C00002','モモもも桃','もも',400,'今日は贅沢しませんか？','./img/products/peech.jpg');
INSERT INTO FOOD VALUES
('AA000036','C00002','サクランボさくらんぼ','さくらんぼ',800,'ひとくち感覚！','./img/products/cherry.jpg');
INSERT INTO FOOD VALUES
('AA000037','C00002','スイカすいか西瓜','スイカ',1500,'夏の定番はコレ！','./img/products/watermelon.jpg');
INSERT INTO FOOD VALUES
('AA000038','C00002','アンズあんず杏子','アンズ',2000,'お酒にしてもおいしい！','./img/products/anzu.jpg');
INSERT INTO FOOD VALUES
('AA000039','C00002','プラムぷらむ','プラム',2000,'大人の味！','./img/products/plum.jpg');
INSERT INTO FOOD VALUES
('AA000040','C00003','リンゴジュースりんごじゅーすりんごジュース林檎じゅーす林檎ジュース','りんごジュース',2000,'すっきりジューシー！','./img/products/applejuice.jpg');
INSERT INTO FOOD VALUES
('AA000041','C00003','トマトジュースとまとじゅーすとまとジューストマトじゅーす','トマトジュース',800,'たっぷり濃厚！','./img/products/tomatojuice.jpg');
INSERT INTO FOOD VALUES
('AA000042','C00003','ブドウジュースぶどうじゅーすぶどうジュースブドウじゅーす葡萄ジュース葡萄じゅーす','ぶどうジュース',800,'さっぱりおいしい！','./img/products/grapejuice.jpg')
;


create table PAYMENT(
paymentid int not null,

payuserid VARCHAR(20)not null,

primary key (paymentid),

foreign key (payuserid) references ACCOUNT(accountid)
    on update no action
    on delete no action
);



create table ORDERS(
ordersid VARCHAR(300)not null, 
orderuserid VARCHAR(30)not null, 
orderdate VARCHAR(100) not null,
orderfoodname VARCHAR(100)not null,
orderquantity int not null,
ordersingleprice VARCHAR(100)not null,
deliveryfee VARCHAR(100)not null,
totalprice int not null,
orderaddress VARCHAR(100)not null,

primary key (ordersid)

);




create table ORDERDETAIL(
order_id VARCHAR(10)not null, 
foodorderid VARCHAR(10)not null, 
orderquantity int not null,
orderprice int not null,


foreign key (order_id) references ORDERS(ordersid )
    on update no action
    on delete no action,
    
foreign key (foodorderid) references FOOD(foodid )
    on update no action
    on delete no action

);



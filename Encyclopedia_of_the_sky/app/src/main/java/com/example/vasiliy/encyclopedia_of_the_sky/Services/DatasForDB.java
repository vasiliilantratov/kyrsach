package com.example.vasiliy.encyclopedia_of_the_sky.Services;

public class DatasForDB {
    //
    // Темы для игры
    //
    public String[] themes = {"Созвездия", "Планеты"};
    public int[] intId = {        101,         102};
    //public String[] themes = {"Созвездия", "Планеты", "Планеты", "Планеты", "Планеты", "Планеты", "Планеты", "Планеты", "Планеты", "Планеты"};
    //public int[] intId = {        101,         102,         102   ,         102   ,         102   ,         102   ,         102   ,         102   ,         102   ,         102      };


    //
    // Все объекты
    //
    public String[] skyObjects = {"Созвездия", "Планеты", "Звезды", "Звездные скопления", "Туманности", "Черные дыры", "Галактики", "Астероиды и кометы", "Темная материя"};
    public int[] skyObjectsId = {    101,        102,       103,           104,               105,           106,          107,              108,              109};
    public String[] skyObjetcsImg = {"constellation_main", "main_list_planet", "main_list_star", "main_build_black_36dp", "main_list_planet", "main_build_black_36dp", "main_list_planet", "main_list_star", "main_build_black_36dp"};


    //
    // Созвездия
    //
    public String[] constellationName = {"Персей", "Лев", "Андромеда", "Большая Медведица", "Овен", "Цефей", "Дельфин", "Змееносец", "Кит", "Компас"};
    public int[] constelletionId = {       151,     152,       153,            154,           155,    156,      157,         158,     159,     160};
    public String[] constellationImg = {"constellation_persei", "constellation_lev", "constellation_andromeda", "constellation_bolshaya_medved", "constellation_oven", "constellation_cefer", "constellation_delphin", "constellation_zneenosec", "constellation_kit", "constellation_compas"};
    public String[] constellationWhereFrom = {
            "Расположен в Млечном Пути к востоку от Андромеды. Занимает на небе площадь в 615.0 квадратного градуса и содержит 153 звезды, видимые невооруженным глазом.",
            "Находится в Зодиаке между Раком и Девой. Занимает на небе площадь в 947.0 квадратного градуса и содержит 122 звезды, видимых невооруженным глазом. ",
            "Найдите Большой Квадрат Пегаса, который осенними вечерами расположен в южной стороне неба. Андромеда состоит из трех цепочек звезд, выходящих из северного угла Квадрата к северо-востоку, в сторону Персея. Андромеда занимает на небе площадь в 722,3 квадратного градуса и содержит 160 звезд, видимых невооруженным глазом (т.е. имеющих блеск до 6,5 звездной величины).",
            "Крупное северное созвездие, семь ярких звезд которого образуют известный Ковш. Созвездие занимает на небе площадь в 1279.7 квадратного градуса и содержит 210 звезд, видимых невооруженным глазом.",
            "Овен лежит к югу от созвездий Треугольника и Персея, севернее головы Кита. Овен занимает на небе площадь в 441.4 квадратного градуса и содержит 82 звезды, видимые невооруженным глазом. ",
            "Созвездие лишено ярких звезд и лежит между Кассиопеей и Малой Медведицей. Занимает на небе площадь 587.8 квадратного градуса и содержит 148 звезд, видимых невооруженным глазом. ",
            "Симпатичная маленькая группа звезд, похожая на ромбик с хвостиком. Лежит между Орлом и Лебедем к востоку от Млечного Пути. Занимает на небе площадь в 188.6 квадратного градуса и содержит 42 звезды, видимые невооруженным глазом.",
            "Большое созвездие к югу от Геркулеса и к северу от Скорпиона. Арат включал в Змееносца и “змею”, которую он держит; в наше время это самостоятельное созвездие Змеи, уникальное тем, что состоит из двух частей, разделенных Змееносцем, который занимает на небе площадь в 948.3 квадратного градуса и содержит 168 звезд, видимых невооруженным глазом.",
            "Это “морское чудовище” лежит к югу от Рыб и Овна, протянувшись от Водолея до Тельца и Эридана. Занимает на небе площадь в 1231.4 квадратного градуса и содержит 170 звезд, видимых невооруженным глазом.",
            "Введено Лакайлем как Компас Мореплавателя. Лежит к востоку от Кормы. Занимает на небе площадь в 220.8 квадратного градуса и содержит 43 звезды, видимые невооруженным глазом."
    };
    public String[] constellationTextInf = {
            "По греческому мифу Персей был сыном Зевса и царевны Данаи; он победил горгону Медузу и спас Андромеду от морского чудовища. Имя звезды α Персея, Мирфак по-арабски значит “локоть”. Это бледно-желтый сверхгигант с видимым блеском 1.8 звездной величины. Очень интересна затменная переменная звезда Алголь (β Персея), что по-арабски значит “чудовище”. Это сложная система из трех или четырех звезд, две из которых с периодом 2.87 суток затмевают друг друга; в эти моменты блеск звезды уменьшается от 2.06 до 3.28 звездной величины. Первым это затмение обнаружил 8 ноября 1670 г. профессор Джеминиано Монтанари (1633-1687) из Модены (Италия). Несомненный интерес для наблюдения представляет двойное рассеянное скопление h и χ Персея, удаленное на 6.5 тыс. св. лет, но имеющее 4 видимую звездную величину.",
            "Созвездие было известно шумерам еще 5000 лет назад. Классический миф связывает Льва с немейским чудовищем, убитым Гераклом. Расположение звезд действительно напоминает лежащего льва. Его “голова” – известный астеризм Серп с яркой звездой внизу. Это α Льва, Регул, что значит “царь”. Ее светимость в 165 раз выше солнечной, а высокий блеск (1.36 звездной величины) объясняется относительной близостью к нам (84 св. года). В задней части фигуры находится вторая по яркости звезда, Денебола, в переводе с арабского “хвост льва”.",
            "В греческих мифах Андромеда – дочь эфиопского царя Цефея и царицы Кассиопеи. Морское чудовище, посланное Посейдоном, должно было съесть Андромеду, но Персей спас ее.",
            "Греческий миф повествует, что прекрасная нимфа Каллисто была превращена Зевсом в Медведицу, чтобы спасти ее от мести Геры.Звезды α и β называют Указателями, поскольку проведенная через них прямая упирается в Полярную звезду. У всех звезд Ковша есть свои имена: Дубге (α) по-арабски значит \"медведь\"; Мерак (β) – \"поясница\"; Фекда (γ) – \"бедро\"; Мегрец (δ) – \"корень\" (начало хвоста); Алиот (ε) – смысл не ясен; Мицар (ζ) – \"набедренная повязка\"; Алькаид (или Бенетнаш, η) – \"хозяин\". Все они 2-3 звездной величины. Но система Байера обозначения звезд греческими буквами в порядке убывания их блеска для Ковша не справедлива: в этом астеризме порядок букв просто соответствует порядку звезд. Рядом с Мицаром зоркий глаз видит звезду 4 величины Алькор, на персидском – \"незначительная\" или \"забытая\".",
            "Овен (баран) – одно из наиболее заметных созвездий Зодиака. Имя ярчайшей звезды Овна, – Гамаль, по-арабски значит “подросший ягненок”. Шумеры называли Овен “созвездием барана”. Разумеется, это тот самый золоторунный баран, который спас Фрикса и Геллу от их мачехи Ино. Они собирались добраться до Колхиды, но Гелла утонула в водах пролива, получившего ее имя – Геллеспонт (ныне – Дарданеллы). Но Фрикс добрался до Колхиды, принес в жертву барана, а руно вручил царю Ээту.",
            "Цефей (или Кефей) – мифический эфиопский царь, супруг Кассиопеи, отец Андромеды. Звезда δ Цефея – прототип пульсирующих переменных звезд и симпатичная визуальная двойная. Ее блеск меняется с периодом 5.4 суток от 3.78 до 4.63 звездной величины. А звезда VV Цефея – самая большая среди известных нам звезд: это затменная переменная, главный компонент которой в 2000 раз больше Солнца.",
            "Согласно греческому мифу, это тот дельфин, который помог Посейдону найти нимфу Амфитриту и был за это помещен на небо.",
            "Греческий миф связывает Змееносца с именем великого Асклепия, бога врачевания, сына Аполлона и нимфы Корониды. Убив жену за измену, Аполлон передал младенца Асклепия на воспитание мудрому Хирону, знатоку медицины. Выросший Асклепий пришел к дерзкой мысли воскрешать мертвых, за что разгневанный Зевс поразил его молнией и поместил на небо.",
            "У греков китом было чудище, посланное Посейдоном, чтобы разрушить страну Цефея и сожрать его дочь Андромеду. Самой известной звездой в Ките является Мира (\"изумительная\"). Это долгопериодическая переменная звезда, красный гигант, изменяющий свой блеск с периодом 332 суток от 2 до 10 звездной величины.",
            "Новое созвездие. На старинных небесных атласах на месте Компаса обычно располагалась мачта созвездия Корабль Арго, которая не выделялась как специальная часть Корабля. Введено Лакайлем в 1754 году под названием «Компас мореплавателя» в память о морском путешествии в Африку, где астроном в 1750 — 1754 проводил наблюдения по поручению парижской Академии наук. Позже Лакайль присоединил его к трём созвездиям — Киль, Корма и Паруса, — на которые предложил в 1756 году разделить старое большое созвездие Корабль Арго."
    };


    //
    // Планеты, экзопланеты и карликовые планеты
    //
    public String[] planetName = { "Венера", "Марс", "Нептун", "Меркурий", "Земля", "Юпитер", "Сатурн", "Уран", "Плутон", "Церера" };
    public int[] planetId = {         201,     202,    203,       204,       205,      206,      207,     208,     209,      210   };
    public String[] planetImg = { "planet_venera", "planet_mars", "planet_neptyn", "planet_merkyryi", "planet_zemla", "planet_upiter", "planet_saturn", "planet_uran", "planet_plyton", "planet_ceres" };
    public String[] planetMass = { "4,8685*10^24 кг", "6,4185*10^23 кг", "1,0243·10^26 кг", "3,33022·10^23 кг", "5,972^24 кг", "1,8986·10^27 кг", "5,6846·10^26 кг", "8,6832·10^25 кг", "1,305·1022 кг", "8,958^20 кг" };
    public String[] planetRadius = { "6051,8 ± 1,0 км", "3389,5 км", "24341 ± 30 км", "2439,7 ± 1,0 км", "6 371 км", "69 911 ± 6 км", "60 268 ± 4 км", "24 973", "1153 км", "487,3 ± 1.8 км" };
    public String[] planetDay = { "116д 18ч 0м", "1.6597д", "0,6653д", "58д 15ч 30м", "24ч", "9ч 56м", "10ч 39м", "17ч 14м", "6 дней 9 часов", "?" };
    public String[] planetYear = { "225 дней", "687 суток", "164,8 года", "88 дней", "365 дней", "12 лет", "29 лет", "84 года", "248 лет", "1 680 дней" };
    public String[] planetRadiusSun = {"108 200 000 км", "228 млн. км", "4,55 млрд км", "57 910 000 км", "149 600 000 км", "778 500 000 км", "1 433 000 000 км", "2 877 000 000 км", "7,4 миллиарда км", "419 млн км"};
    public String[] planetInfo = {
            "Планета Венера — вторая планета от Солнца, названа именем древней римской богини любви и красоты. Интересный факт о планете: Венера — единственная планета, названная в честь женщины, возможно, была названа по имени самого красивого божества, потому что она излучала свет ярче всех из пяти планет, известных древним астрономам. На латыни планета Венера была известна как Вечерняя звезда и Люцифер. В христианские времена Люцифер или «легкий вестник», был известен как Сатана. Интересный факт: Венера — самая горячая планета в Солнечной системе и вторая от Солца, после Меркурия. Хотя Венера не является ближайшей к Солнцу планетой, однако ее плотная атмосфера так называемая, ловушка тепла, создает парниковый эффект, который также нагревает Землю. В результате этого, температура на Венере может достигать 870 градусов по Фаренгейту (465 градусов по Цельсию), что более чем достаточно, для того, чтобы расплавить горячий свинец. Зонды, которые ученые высаживали там, оставались невредимыми лишь на несколько часов, после чего они были уничтожены.",
            "Из-за кроваво-красного цвета планеты Марс, древние римляне назвали в его честь своего бога войны. Другие народы также давали имя этой планете, исходя из ее цвета. К примеру, доказан интересный научный факт, что египетское «Her Desher» переводится как «красный», а древнекитайские астрономы именовали планету не иначе как «огненной звездой». Марс — четвертая планета в Солнечной системе от Солнца. Яркий ржавый цвет Марса, как известно, обусловлен тем, что его поверхность состоит из реголита, богатого железом, минеральной пылью и камнями. В определенной степени почва Земли аналогична марсианскому реголиту, однако содержит гораздо больше органических веществ. Холодная и тонкая атмосфера исключает присутствие на Марсе жидкой воды. Это позволяет с достаточной точностью утверждать, что эта пустынная планета, чей диаметр вдвое меньше диаметра Земли, полностью лишена какой-либо органической жизни.",
            "В соответствии с именованием других планет Солнечной системы, этому нового миру было дано имя из греческой и римской мифологии – Нептун, бог моря у римлян. Облака планеты Нептун имеют особенный яркий голубой оттенок, что отчасти связано с пока еще неизвестным соединением и результатом поглощения красного цвета метаном, преобладающей   в водородно-гелиевой атмосфере планеты Нептун. Фотографии Нептуна показывают голубую планету, поэтому его часто называют ледяным гигантом, так как он обладает слоем из водяного, аммиачного и метанового льда под атмосферой, который имеет массу в 17 раз больше массы Земли и объем в 58 раз больше объема Земли. Каменное ядро Нептуна, как полагают, примерно равно массе Земли.",
            "Римляне назвали планету в честь быстроногого посланника бога Меркурия. Меркурию также давали различные названия из-за разного времени его появления — утренняя звезда или вечерняя звезда. Греческие астрономы, однако, знали, что это — название одного и того же небесного тела. Гераклит считал, что Меркурий и Венера вращаются вокруг Солнца, а не вокруг Земли. Меркурий является самой маленькой планетой — он немного больше, чем Луна. Очень интересный факт о планете Меркурий: из-за отсутствия атмосферы и близости к Солнцу он подвержен внешним воздействиям, и поэтому изрешечен кратерами. Около 4 миллиардов лет назад астероид шириной примерно 60 миль (100 километров) нанёс удар Меркурию с силой, сравнимой с триллионом мегатонных бомб. При этом образовался огромный кратер шириной примерно 960 миль (1550 км). Теперь он известен как Бассейн Калорис. Он мог бы вместить весь штат Техас.",
            "Как только мы оставим позади плотные облака Венеры, то встретимся с поистине потрясающим зрелищем. По мере приближения к третьей планете от Солнца, мы видим блестящую голубую сферу невообразимой красоты, а пару ей составляет единственная, большая и скалистая Луна. Изящная завеса тонких белых облаков охватывает этот голубой глобус. Синий цвет этого необычного мира обусловлен наличием воды в жидком виде, что является редким зрелищем в Солнечной системе. На самом деле, это действительно уникальный подарок, который, как известно, существует лишь на одной этой планете. Синие участки разбиты скалистыми формами покрытые цветом, которого мы никогда не видели прежде. Красивые коричневые участки земли окрашены в различные оттенки зеленого цвета. Всё это формы жизни. Эта планета является домом для живых организмов, что делает её, возможно, уникальной во всей Вселенной. Это система Земля-Луна, состоящая из планеты Земля и её одинокой Луны. Система Земля-Луна является домом для единственной известной планеты во Вселенной, скрывающей в себе волшебство жизни. И жизнь на Земле существует в множестве форм и видов. Считается, что впервые жизнь на Земле зародилась около 3,5 миллиарда лет назад. Этими ранними формами жизни были простые одноклеточные организмы, которые жили в воде. Ранние формы жизни могли получать энергию Солнца посредством процесса, известного как фотосинтез. Благодаря чуду клеточной мутации и изменению окружающей среды жизнь развилась в невообразимо сложные формы. Сегодня существуют миллионы видов животных и растений, населяющих Землю. У одного из этих существ даже развились самосознание, интерес к вопросу собственного существования, и живое любопытство исследовать окружающий мир. Этим существом является человек.",
            "Планета Юпитер помогла осознать то, как мы видим  нашу вселенную,  когда в 1610 году  Галилей открыл четыре больших спутника Юпитера — Ио, Европа, Ганимед и Каллисто, теперь известные как Галилеевы спутники. Впервые в истории были обнаружены спутники, вращающиеся вокруг другой планеты, что стало доказательством теории Коперника о том, что Земля не является центром Вселенной. Юпитер был царем богов в римской мифологии — подходящее название для самой крупной планеты. Аналогичным образом, древние греки назвали планету Зевсом, царем греческого пантеона. Планета Юпитер является самой большой планетой в нашей Солнечной системе, более чем в два раза массивнее всех остальных планет вместе взятых, а если бы он был примерно в 80 раз еще более массивней, то мог бы стать звездой, а не планетой. Его атмосфера напоминает Солнце. Он состоит в основном из водорода и гелия, а также с четырьмя большими лунами и множество мелких лун на своей орбите, Юпитер сам по себе образует своего рода миниатюрную Солнечную систему. Красочные темные и светлые полосы Юпитера созданы сильными восточно-западными ветрами в верхних слоях планеты, бушующими со скоростью более чем 400 миль в час (640 километров в час).",
            "Интересно, что имя «Сатурн» произошло от римского имени Кронос, который был владыкой титанов в греческой мифологии.  Слово «Сатурн» является корнем английского слова «суббота». Планета Сатурн – шестая планета от Солнца и вторая по величине в Солнечной системе. Хотя другие газовые гиганты в Солнечной системе – Юпитер, Уран, Нептун – также имеют кольца, кольца Сатурна, без сомнения, самые необычные. Факт, что газовый гигант Сатурн состоит в основном из водорода и гелия. Сатурн является достаточно большим, чтобы содержать более 769 элементов и более массивным, чем любая другая планета, кроме Юпитера. Масса планеты Сатурн примерно в 95 раз больше массы Земли. Одним из самых интересных фактов Сатурна является то, что Сатурн имеет самую низкую плотность из всех планет и  является менее плотным, чем вода – так что, если бы существовала достаточно большая ванная, чтобы поместить его, Сатурн будет плавать.",
            "Хотя Уран виден невооруженным глазом, так же как и другие  планеты -Меркурий, Венера, Марс, Юпитер и Сатурн – долгое время ошибочно предполагали, что это звезда, из-за полумрака планеты и медленной орбиты. Интересно, что британский астроном Уильям Гершель открыл планету Уран случайно 13 марта 1781 года, во время съемки звезд. Одна «звезда» оказалась отличной от других, так как в течение года Уран следовал по планетарной орбите. Интересный факт: многие имена были предложены для новой планеты, в том числе » Hypercronius » (» над Сатурном «), » Минерва » (римская богиня мудрости), и « Гершель ».  Отдавая почтение королю Англии Георгу III, Гершель предложил назвать планету » Georgium Sidus » (» Планета Георга «), но эта идея не была популярна за пределами Англии и в родном для Георга Гановере.  Немецкий астроном Иоганн Боде, который детально изучил орбиту Урана дал ей конечное название. Планета Уран, назван в честь греческого бога неба Урана, самого раннего из всех повелителей неба. Сине-зеленый цвет Урана —   результат присутствия метана в водородно-гелиевой атмосфере. Планету часто называют ледяным гигантом, так  как он на 80% и более процентов состоит из жидкой смеси водного, метанового и аммиачного льда.",
            "Плутон – это единственная планета в мире, название которой было дано 11-летним ребёнком — девочкой Венецией Берни (Оксфорд, Англия). Венеция посчитала уместным назвать вновь открытую планету именем римского бога и высказала это мнение своему дедушке. Он же передал идею своей внучки в обсерваторию Лоуэлла. Название Плутон было принято. Необходимо отметить, что две первых буквы этого слова отражают инициалы Персиваль Лоуэлла. Карликовая планета Плутон является единственной планетой-карликом в Солнечной системе, которая стояла в ряду основных планет. Не так давно Плутон считался полноценной девятой планетой, наиболее удалённой от Солнца. Теперь же он рассматривается, как один из самых крупных объектов пояса Койпера – тёмной дискообразной зоны, за пределами орбиты Ньютона, содержащий триллионы комет. Плутон причислили к планетам-карликам в 2006 году. Это событие рассматривалось, как понижение в статусе и вызвало бурные споры и дискуссии в научных и общественных кругах. Признаки существования Плутона впервые заметил астроном из США Персиваль Лоуэлл в 1905 году. Наблюдая за Непутном и Ураном, он обнаружил отклонения в их орбитах и предположил, что это вызвано действием гравитации неизвестного крупного небесного объекта. В 1915 году он рассчитал возможное местоположение этого объекта, но умер, так и не найдя его. В 1930 году Клайд Томбо из Обсерватории Лоуэлла, основываясь на прогнозах Лоуэлла, обнаружил девятую планету и сообщил об её открытии.",
            "Ученые назвали Церера «эмбриональной планетой». Гравитационное возмущение Юпитера миллиарды лет назад помешало ей стать полноправной планетой. Церера, в конечном счете, осталась среди обломков планетарного образования в главном поясе астероидов между Марсом и Юпитером, известном как пояс астероидов. Космический телескоп НАСА Хаббл заметил, что вращение Цереры показывает, что она имеет почти сферическую форму. Диаметр Цереры на экваторе больше, чем на полюсах. Церера имеет около 590 миль (950 километров) в поперечнике. И хотя Церера составляет 25 процентов общей массы пояса астероидов, крошечный Плутон в 14 раз массивнее. Но Церера имеет больше общего с Землей и Марсом, чем ее скалистые соседи. Есть признаки того, что Церера содержит большое количество чистого водяного льда под поверхностью. Ученые, использующие космическую обсерваторию Гершель, нашли доказательства паров воды на Церере: перья водяного пара, как полагают, периодически вырываются из поверхности Цереры, когда часть ее ледяной поверхности нагревается на Солнце. Это доказывает, что Церера имеет ледяную поверхность."
    };


    //
    // Элементы неба
    //
    public String[] elemSky = { "Звезды", "Звездные скопления", "Туманности", "Черные дыры", "Галактики", "Астероиды и кометы", "Темная материя"};
    public String[] elemText = {
            "Звезда — излучающий свет массивный газовый шар, удерживаемый силами собственной гравитации и внутренним давлением, в недрах которого происходят (или происходили ранее) реакции термоядерного синтеза. Ближайшей к Земле звездой является Солнце — типичный представитель спектрального класса G. Звёзды образуются из газово-пылевой среды (главным образом из водорода и гелия) в результате гравитационного сжатия. Температура вещества в недрах звёзд измеряется миллионами кельвинов, а на их поверхности — тысячами кельвинов. Энергия подавляющего большинства звёзд выделяется в результате термоядерных реакций превращения водорода в гелий, происходящих при высоких температурах во внутренних областях. Звёзды часто называют главными телами Вселенной, поскольку в них заключена основная масса светящегося вещества в природе. Примечательно и то, что звёзды имеют отрицательную теплоёмкость. Звёздные системы могут быть одиночными и кратными: двойными, тройными и большей кратности. В случае если в систему входит более десяти звёзд то принято её называть звёздным скоплением. Двойные (кратные) звёзды очень распространены. По некоторым оценкам, более 70 % звёзд в галактике кратные. Так, среди 32 ближайших к Земле звёзд 12 кратных, из которых 10 двойных (в том числе и самая яркая из визуально наблюдаемых звёзд — Сириус). В окрестностях 20 парсек от Солнечной системы из более 3000 звёзд, около половины — двойные звёзды всех типов.",
            "Звёздное скопление — гравитационно связанная группа звёзд, имеющая общее происхождение и движущаяся в гравитационном поле галактики как единое целое. Некоторые звёздные скопления также содержат, кроме звёзд, облака газа и/или пыли. По своей морфологии звёздные скопления исторически делятся на два типа — шаровые и рассеянные. В июне 2011 года стало известно об открытии нового класса скоплений, который сочетает в себе признаки и шаровых, и рассеянных скоплений. Группы гравитационно несвязанных звёзд или слабосвязанных молодых звёзд, объединённых общим происхождением, называют звёздными ассоциациями.",
            "Туманность — участок межзвёздной среды, выделяющийся своим излучением или поглощением излучения на общем фоне неба. Ранее туманностями называли всякий неподвижный на небе протяжённый объект. В 1920-е годы выяснилось, что среди туманностей много галактик (например, Туманность Андромеды). После этого термин «туманность» стал пониматься более узко, в указанном выше смысле. \n\n"
                    + "Туманности состоят из пыли, газа и плазмы. Первичный признак, используемый при классификации туманностей — поглощение, или же излучение либо рассеивание ими света, то есть по этому критерию туманности делятся на тёмные и светлые. Первые наблюдаются благодаря поглощению излучения расположенных за ними источников, вторые — благодаря собственному излучению или же отражению (рассеиванию) света расположенных рядом звёзд. Природа излучения светлых туманностей, источники энергии, возбуждающие их излучение, зависят от их происхождения и могут иметь разнообразную природу; нередко в одной туманности действуют несколько механизмов излучения.\n\n"
                    + "Деление туманностей на газовые и пылевые в значительной степени условно: все туманности содержат и пыль, и газ. Такое деление исторически обусловлено различными способами наблюдения и механизмами излучения: наличие пыли наиболее ярко наблюдается при поглощении тёмными туманностями излучения расположенных за ними источников и при отражении или рассеивании, или переизлучении, содержащейся в туманности пылью излучения расположенных поблизости или в самой туманности звёзд; собственное излучение газовой компоненты туманности наблюдается при её ионизации ультрафиолетовым излучением расположенной в туманности горячей звезды (эмиссионные области H II ионизированного водорода вокруг звёздных ассоциаций или планетарные туманности) или при нагреве межзвёздной среды ударной волной вследствие взрыва сверхновой или воздействия мощного звёздного ветра звёзд типа Вольфа — Райе.",
            "Чёрная дыра — область в пространстве-времени, гравитационное притяжение которой настолько велико, что покинуть её не могут даже объекты, движущиеся со скоростью света, в том числе кванты самого света. Граница этой области называется горизонтом событий, а её характерный размер — гравитационным радиусом. В простейшем случае сферически симметричной чёрной дыры он равен радиусу Шварцшильда. \n\n"
                    + "Теоретически возможность существования таких областей пространства-времени следует из некоторых точных решений уравнений Эйнштейна, первое из которых было получено Карлом Шварцшильдом в 1915 году. Точный изобретатель термина неизвестен, но само обозначение было популяризовано Джоном Арчибальдом Уилером и впервые публично употреблено в популярной лекции «Наша Вселенная: известное и неизвестное» (англ. Our Universe: the Known and Unknown) 29 декабря 1967 года. Ранее подобные астрофизические объекты называли «сколлапсировавшие звёзды» или «коллапсары» (от англ. collapsed stars), а также «застывшие звёзды» (англ. frozen stars).",
            "Галактика (др.-греч. γᾰλαξίας «Млечный Путь» от др.-греч. γάλα, γάλακτος «молоко») — гравитационно-связанная система из звёзд и звёздных скоплений, межзвёздного газа и пыли, и тёмной материи. Все объекты в составе галактики участвуют в движении относительно общего центра масс. \n\n"
                    + "Галактики (кроме галактики Млечный Путь, внутри которой находится Земля) — чрезвычайно далёкие астрономические объекты. Расстояние до ближайших из них принято измерять в мегапарсеках, а до далёких — в единицах красного смещения z . Самой удалённой из известных по состоянию на декабрь 2012 года является галактика UDFj-39546284. Разглядеть на небе невооружённым глазом можно всего лишь три галактики: туманность Андромеды (видна в северном полушарии), Большое и Малое Магеллановы Облака (видны в южном)."
                    + "Разрешить изображение галактик до отдельных звёзд не удавалось вплоть до начала XX века. К началу 1990-х годов насчитывалось не более 30 галактик, в которых удалось увидеть отдельные звёзды, и все они входили в Местную группу. После запуска космического телескопа «Хаббл» и ввода в строй 10-метровых наземных телескопов число разрешённых галактик резко возросло.\n\n"
                    + "Галактики отличаются большим разнообразием: среди них можно выделить сфероподобные эллиптические галактики, дисковые спиральные галактики, галактики с перемычкой (баром), линзовидные, карликовые, неправильные и т. д. . Если же говорить о числовых значениях, то, к примеру, их масса варьируется от 107 до 1012 масс Солнца, для сравнения — масса нашей галактики Млечный Путь равна 2·1011 масс Солнца. Диаметр галактик — от 5 до 250 килопарсек[6] (16—800 тысяч световых лет), для сравнения — диаметр нашей галактики около 30 килопарсек (100 тысяч световых лет). Самая большая известная (на 2012 год) галактика IC 1101 имеет диаметр более 600 килопарсек.",
            "Астероид (распространённый до 2006 года синоним — малая планета) — относительно небольшое небесное тело Солнечной системы, движущееся по орбите вокруг Солнца. Астероиды значительно уступают по массе и размерам планетам, имеют неправильную форму и не имеют атмосферы, хотя при этом и у них могут быть спутники. \n\n"
                    + "Комета (от др.-греч. κομήτης, komḗtēs — волосатый, косматый) — небольшое небесное тело, имеющее туманный вид, обращающееся вокруг Солнца по коническому сечению с весьма растянутой орбитой. При приближении к Солнцу комета образует кому и иногда хвост из газа и пыли.",
            "Тёмная материя в астрономии и космологии, а также в теоретической физике — гипотетическая форма материи, которая не испускает электромагнитного излучения и напрямую не взаимодействует с ним[1]. Это свойство данной формы вещества делает невозможным её прямое наблюдение.\n\n"
                    + "Вывод о существовании тёмной материи сделан на основании многочисленных, согласующихся друг с другом, но косвенных признаков поведения астрофизических объектов и по создаваемым ими гравитационным эффектам. Обнаружение природы тёмной материи поможет решить проблему скрытой массы, которая, в частности, заключается в аномально высокой скорости вращения внешних областей галактик. \n\n"
                    + "В истории науки встречались ситуации, когда движение небесных тел не подчинялось законам небесной механики; как правило, это явление находило объяснение в существовании неизвестного материального тела (или нескольких тел). Именно так были открыты планета Нептун и звезда Сириус B. В 1922 году астрономы Джеймс Джинс и Якобус Каптейн исследовали движение звёзд в нашей Галактике и пришли к выводу, что бо́льшая часть вещества в галактике невидима; в этих работах, вероятно, впервые появился термин «тёмная материя» (англ. dark matter)[3]. Ян Оорт использовал тот же термин в статье 1932 года."
    };


}


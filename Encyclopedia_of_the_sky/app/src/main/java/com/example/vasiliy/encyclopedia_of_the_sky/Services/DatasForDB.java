package com.example.vasiliy.encyclopedia_of_the_sky.Services;

public class DatasForDB {
    //
    // Все объекты
    //
    public String[] sky_objects = {"Созвездия", "Звезды", "Звездные скопления", "Планеты", "Туманности", "Черные дыры", "Галактики", "Остероиды и кометы", "Темная материя"};
    public int[] sky_objects_id = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110};
    public String[] sky_objetcs_img = {"constellation_main", "main_list_star", "main_list_planet", "main__description_black_36dp", "main_list_planet",
                                        "main_build_black_36dp", "main_list_planet", "main__description_black_36dp", "main_build_black_36dp"};


    //
    // Созвездия
    //
    public String[] constellationName = {"Персей", "Лев", "Андромеда", "Большая Медведица", "Овен", "Цефей"};
    public int[] constelletionId = {151, 152, 153, 154, 155, 156};
    public String[] constellationImg = {"constellation_persei", "constellation_lev", "constellation_andromeda", "constellation_bolshaya_medved", "constellation_oven", "constellation_cefer"};
    public String[] constellationWhereFrom = {
            "Расположен в Млечном Пути к востоку от Андромеды. Занимает на небе площадь в 615.0 квадратного градуса и содержит 153 звезды, видимые невооруженным глазом.",
            "Находится в Зодиаке между Раком и Девой. Занимает на небе площадь в 947.0 квадратного градуса и содержит 122 звезды, видимых невооруженным глазом. ",
            "Найдите Большой Квадрат Пегаса, который осенними вечерами расположен в южной стороне неба. Андромеда состоит из трех цепочек звезд, выходящих из северного угла Квадрата к северо-востоку, в сторону Персея. Андромеда занимает на небе площадь в 722,3 квадратного градуса и содержит 160 звезд, видимых невооруженным глазом (т.е. имеющих блеск до 6,5 звездной величины).",
            "Крупное северное созвездие, семь ярких звезд которого образуют известный Ковш. Созвездие занимает на небе площадь в 1279.7 квадратного градуса и содержит 210 звезд, видимых невооруженным глазом.",
            "Овен лежит к югу от созвездий Треугольника и Персея, севернее головы Кита. Овен занимает на небе площадь в 441.4 квадратного градуса и содержит 82 звезды, видимые невооруженным глазом. ",
            "Созвездие лишено ярких звезд и лежит между Кассиопеей и Малой Медведицей. Занимает на небе площадь 587.8 квадратного градуса и содержит 148 звезд, видимых невооруженным глазом. "
    };
    public String[] constellationTextInf = {
            "По греческому мифу Персей был сыном Зевса и царевны Данаи; он победил горгону Медузу и спас Андромеду от морского чудовища. Имя звезды α Персея, Мирфак по-арабски значит “локоть”. Это бледно-желтый сверхгигант с видимым блеском 1.8 звездной величины. Очень интересна затменная переменная звезда Алголь (β Персея), что по-арабски значит “чудовище”. Это сложная система из трех или четырех звезд, две из которых с периодом 2.87 суток затмевают друг друга; в эти моменты блеск звезды уменьшается от 2.06 до 3.28 звездной величины. Первым это затмение обнаружил 8 ноября 1670 г. профессор Джеминиано Монтанари (1633-1687) из Модены (Италия). Несомненный интерес для наблюдения представляет двойное рассеянное скопление h и χ Персея, удаленное на 6.5 тыс. св. лет, но имеющее 4 видимую звездную величину.",
            "Созвездие было известно шумерам еще 5000 лет назад. Классический миф связывает Льва с немейским чудовищем, убитым Гераклом. Расположение звезд действительно напоминает лежащего льва. Его “голова” – известный астеризм Серп с яркой звездой внизу. Это α Льва, Регул, что значит “царь”. Ее светимость в 165 раз выше солнечной, а высокий блеск (1.36 звездной величины) объясняется относительной близостью к нам (84 св. года). В задней части фигуры находится вторая по яркости звезда, Денебола, в переводе с арабского “хвост льва”.",
            "В греческих мифах Андромеда – дочь эфиопского царя Цефея и царицы Кассиопеи. Морское чудовище, посланное Посейдоном, должно было съесть Андромеду, но Персей спас ее.",
            "Греческий миф повествует, что прекрасная нимфа Каллисто была превращена Зевсом в Медведицу, чтобы спасти ее от мести Геры.Звезды α и β называют Указателями, поскольку проведенная через них прямая упирается в Полярную звезду. У всех звезд Ковша есть свои имена: Дубге (α) по-арабски значит \"медведь\"; Мерак (β) – \"поясница\"; Фекда (γ) – \"бедро\"; Мегрец (δ) – \"корень\" (начало хвоста); Алиот (ε) – смысл не ясен; Мицар (ζ) – \"набедренная повязка\"; Алькаид (или Бенетнаш, η) – \"хозяин\". Все они 2-3 звездной величины. Но система Байера обозначения звезд греческими буквами в порядке убывания их блеска для Ковша не справедлива: в этом астеризме порядок букв просто соответствует порядку звезд. Рядом с Мицаром зоркий глаз видит звезду 4 величины Алькор, на персидском – \"незначительная\" или \"забытая\".",
            "Овен (баран) – одно из наиболее заметных созвездий Зодиака. Имя ярчайшей звезды Овна, – Гамаль, по-арабски значит “подросший ягненок”. Шумеры называли Овен “созвездием барана”. Разумеется, это тот самый золоторунный баран, который спас Фрикса и Геллу от их мачехи Ино. Они собирались добраться до Колхиды, но Гелла утонула в водах пролива, получившего ее имя – Геллеспонт (ныне – Дарданеллы). Но Фрикс добрался до Колхиды, принес в жертву барана, а руно вручил царю Ээту.",
            "Цефей (или Кефей) – мифический эфиопский царь, супруг Кассиопеи, отец Андромеды. Звезда δ Цефея – прототип пульсирующих переменных звезд и симпатичная визуальная двойная. Ее блеск меняется с периодом 5.4 суток от 3.78 до 4.63 звездной величины. А звезда VV Цефея – самая большая среди известных нам звезд: это затменная переменная, главный компонент которой в 2000 раз больше Солнца."
    };


    //
    // Планеты, экзопланеты и карликовые планеты
    //
    public String[] planetName = { "Венера", "Марс", "Нептун" };
    public int[] planetId = { 201, 202, 203 };
    public String[] planetImg = { "planet_venera", "planet_mars", "planet_neptyn" };
    public String[] planetMass = { "4,8685*10^24 кг", "6,4185*10^23", "1,0243·1026" };
    public String[] planetRadius = { "6051,8 ± 1,0 км", "3389,5 км", "24 341 ± 30 км" };
    public String[] planetDay = { "116д 18ч 0м", "1.6597д", "0,6653д" };
    public String[] planetYear = { "225 дней", "687 суток", "164,8 года" };
    public String[] planetRadiusSun = {"108 200 000 км", "228 млн. км"};
    public String[] planetInfo = {
            "Планета Венера — вторая планета от Солнца, названа именем древней римской богини любви и красоты. Интересный факт о планете: Венера — единственная планета, названная в честь женщины, возможно, была названа по имени самого красивого божества, потому что она излучала свет ярче всех из пяти планет, известных древним астрономам. На латыни планета Венера была известна как Вечерняя звезда и Люцифер. В христианские времена Люцифер или «легкий вестник», был известен как Сатана. Интересный факт: Венера — самая горячая планета в Солнечной системе и вторая от Солца, после Меркурия. Хотя Венера не является ближайшей к Солнцу планетой, однако ее плотная атмосфера так называемая, ловушка тепла, создает парниковый эффект, который также нагревает Землю. В результате этого, температура на Венере может достигать 870 градусов по Фаренгейту (465 градусов по Цельсию), что более чем достаточно, для того, чтобы расплавить горячий свинец. Зонды, которые ученые высаживали там, оставались невредимыми лишь на несколько часов, после чего они были уничтожены.",
            "Из-за кроваво-красного цвета планеты Марс, древние римляне назвали в его честь своего бога войны. Другие народы также давали имя этой планете, исходя из ее цвета. К примеру, доказан интересный научный факт, что египетское «Her Desher» переводится как «красный», а древнекитайские астрономы именовали планету не иначе как «огненной звездой». Марс — четвертая планета в Солнечной системе от Солнца. Яркий ржавый цвет Марса, как известно, обусловлен тем, что его поверхность состоит из реголита, богатого железом, минеральной пылью и камнями. В определенной степени почва Земли аналогична марсианскому реголиту, однако содержит гораздо больше органических веществ. Холодная и тонкая атмосфера исключает присутствие на Марсе жидкой воды. Это позволяет с достаточной точностью утверждать, что эта пустынная планета, чей диаметр вдвое меньше диаметра Земли, полностью лишена какой-либо органической жизни.",
            "В соответствии с именованием других планет Солнечной системы, этому нового миру было дано имя из греческой и римской мифологии – Нептун, бог моря у римлян. Облака планеты Нептун имеют особенный яркий голубой оттенок, что отчасти связано с пока еще неизвестным соединением и результатом поглощения красного цвета метаном, преобладающей   в водородно-гелиевой атмосфере планеты Нептун. Фотографии Нептуна показывают голубую планету, поэтому его часто называют ледяным гигантом, так как он обладает слоем из водяного, аммиачного и метанового льда под атмосферой, который имеет массу в 17 раз больше массы Земли и объем в 58 раз больше объема Земли. Каменное ядро Нептуна, как полагают, примерно равно массе Земли."
    };
}


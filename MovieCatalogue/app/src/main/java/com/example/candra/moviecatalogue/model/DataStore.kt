package com.example.candra.moviecatalogue.model

import com.example.candra.moviecatalogue.R

class DataStore {

    companion object {
        private val data: MutableList<Movie> = mutableListOf(
            Movie(
                "Aquaman",
                R.drawable.poster_aquaman,
                "December 2018",
                "2h 24m",
                arrayOf("Fiction", "Adventure", "Action"),
                mutableListOf(
                    Cast("Jason Momoa", "Arthur Curry/Aquaman", R.drawable.jason_momoa),
                    Cast("Amber Heard", "Mera", R.drawable.amber_heard),
                    Cast("Williem Dafoe", "Nuidis Vulko", R.drawable.willem_dafoe),
                    Cast("Patrick Wilson", "King Orm Marius/Ocean Master", R.drawable.patrick_wilson),
                    Cast("Nicole Kidman", "Atlanna", R.drawable.nicole_kidman)
                ),
                "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
                "\$160.000.000",
                "\$1.143.689.193",
                arrayOf(
                    "dr comics",
                    "atlantis",
                    "half-brother",
                    "superhero",
                    "based on comic",
                    "royalty",
                    "shark",
                    "dc extended universe"
                )
            ),
            Movie(
                "A Star Is Born",
                R.drawable.poster_a_star,
                "December 2018",
                "2h 15m",
                arrayOf("Drama", "Percintaan", "Musik"),
                mutableListOf(
                    Cast("Lady Gaga", "Ally Campana", R.drawable.lady_gaga),
                    Cast("Bradley Cooper", "Jackson Maine", R.drawable.bradley_cooper),
                    Cast("Sam Elliott", "Bob Maine", R.drawable.sam_elliot),
                    Cast("Andrew Dice Clay", "Lorenzo Campana", R.drawable.andrew_dice),
                    Cast("Rafi Gavron", "Rez Gavron", R.drawable.rafi_gavron)
                ),
                "Seorang bintang musik country yang karirnya mulai memudar, Jackson Maine (Bradley Cooper) menemukan sebuah talenta yang sangat berbakat di dalam diri dari seorang musisi muda bernama Ally (Lady Gaga). Maine berhasil mengorbitkan Ally menjadi seorang bintang muda yang menjanjikan. Namun keduanya terlibat hubungan yang lebih jauh dari sekedar mentor dan anak didik. Seiring dengan meroketnya karir dari Ally dan dirinya, Maine mengalami dilema mengenai masalah ini.",
                "\$36.000.000",
                "\$433.888.866",
                arrayOf(
                    "country music",
                    "waitress",
                    "self-destruction",
                    "talent",
                    "pop star",
                    "concert",
                    "addiction",
                    "alcoholism",
                    "remake",
                    "death of father",
                    "aspiring singer",
                    "singer",
                    "fame",
                    "tinnitus",
                    "falling in love",
                    "insecurity"
                )
            ),
            Movie(
                "Avenger: Infinity War",
                R.drawable.poster_avengerinfinity,
                "April 2018",
                "2h 28m",
                arrayOf("Petualangan", "Aksi", "Fantasi"),
                mutableListOf(
                    Cast("Robert Downey Jr.", "Tony Stark / Iron Man", R.drawable.robert_downey),
                    Cast("Chris Hemsworth", "Thor Odinson", R.drawable.chris_hemsworth),
                    Cast("Chris Evans", "Steve Rogers / Captain America", R.drawable.chris_evans),
                    Cast("Mark Ruffalo", "Bruce Banner / The Hulk", R.drawable.mark_ruffalo),
                    Cast("Scarlett Johansson", "Natasha Romanoff / Black Widow", R.drawable.scarlett_johansson)
                ),
                "Karena Avengers dan sekutunya terus melindungi dunia dari ancaman yang terlalu besar untuk ditangani oleh seorang pahlawan, bahaya baru telah muncul dari bayangan kosmik: Thanos. Seorang lalim penghujatan intergalaksi, tujuannya adalah untuk mengumpulkan semua enam Batu Infinity, artefak kekuatan yang tak terbayangkan, dan menggunakannya untuk menimbulkan kehendak memutar pada semua realitas. Segala sesuatu yang telah diperjuangkan oleh Avengers telah berkembang hingga saat ini - nasib Bumi dan keberadaannya sendiri tidak pernah lebih pasti.",
                "\$300.000.000",
                "\$2.046.239.637",
                arrayOf(
                    "magic",
                    "sacrifice",
                    "superhero",
                    "based on comic",
                    "space",
                    "battlefield",
                    "genocide",
                    "magical object",
                    "super power",
                    "team",
                    "aftercreditsstinger",
                    "marvel cinematic universe",
                    "cosmic"
                )
            ),
            Movie(
                "Venom",
                R.drawable.poster_venom,
                "October 2018",
                "1h 52m",
                arrayOf("Sciene Fiction", "Action"),
                mutableListOf(
                    Cast("Tom Hardy", "Eddie Brock/Venom", R.drawable.tom_hardy),
                    Cast("Michelle Williams", "Anne Weying", R.drawable.michelle_william),
                    Cast("Riz Ahmed", "Carlton Drake / Riot", R.drawable.riz_ahmed),
                    Cast("Scott Haze", "Security Chief Rolland Treece", R.drawable.scott_haze),
                    Cast("Reid Scott", "Dr. Dan Lewis", R.drawable.reid_scott)
                ),
                "Investigative journalist Eddie Brock attempts a comeback following a scandal, but accidentally becomes the host of Venom, a violent, super powerful alien symbiote. Soon, he must rely on his newfound powers to protect the world from a shadowy organization looking for a symbiote of their own.",
                "\$116.000.000",
                "\$855.013.954",
                arrayOf(
                    "San Fransico",
                    "spacecraft",
                    "anti hero",
                    "alien life-form",
                    "superhero",
                    "based on comic",
                    "spin off",
                    "business tycoon"
                )
            ),
            Movie(
                "Bird Box", R.drawable.poster_birdbox,
                "November 2018", "2h 4m",
                arrayOf("Cerita Seru", "Drama"),
                mutableListOf(
                    Cast("Sandra Bullock", "Malorie Hayes", R.drawable.sandra_bullock),
                    Cast("Trevante Rhodes", "Tom", R.drawable.trevante_rhodes),
                    Cast("John Malkovich", "Douglas", R.drawable.john_malkovich),
                    Cast("Sarah Paulson", "Jessica", R.drawable.sarah_paulson),
                    Cast("Jacki Weaver", "Cheryl", R.drawable.jacky_weaver)
                ),
                "Five years after an ominous unseen presence drives most of society to suicide, a survivor and her two children make a desperate bid to reach safety.",
                "\$19.800.000", "-",
                arrayOf(
                    "based on novel or book",
                    "post-apocalyptic",
                    "blindfold",
                    "doomsday",
                    "survival horror",
                    "woman director",
                    "white water rafting"
                )
            ),
            Movie(
                "Bohemian Rhapsody", R.drawable.poster_bohemian,
                "October 2018", "2h 15m",
                arrayOf("Drama", "Musik"),
                mutableListOf(
                    Cast("Rami Malek", "Freddie Mercury", R.drawable.rami_malek),
                    Cast("Gwilym Lee", "Brian May", R.drawable.gwilym_lee),
                    Cast("Ben Hardy", "Roger Taylor", R.drawable.ben_hardy),
                    Cast("Joseph Mazzello", "John Deacon", R.drawable.joseph_mazelo),
                    Cast("Lucy Boynton", "Mary Austin", R.drawable.lucy_boynton)
                ),
                "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
                "\$52.000.000", "\$835.137.710",
                arrayOf(
                    "london", "gay", "aids", "1970s", "queen", "musician", "biography", "based on a true story",
                    "hiv", "homosexuality", "singer", "fame", "rock band", "music band", "lgbt", "1980s", "parsi"
                )
            ),
            Movie(
                "Bumblebee", R.drawable.poster_bumblebee,
                "December 2018", "1h 54m",
                arrayOf("Aksi", "Petualangan", "Cerita Fiksi"),
                mutableListOf(
                    Cast("Hailee Steinfeld", "Charlie Watson", R.drawable.hailee_steinfeld),
                    Cast("Jorge Lendeborg Jr.", "Memo", R.drawable.jorge_lendeborg),
                    Cast("John Cena", "Agent Jack Burns", R.drawable.john_cena),
                    Cast("Jason Ian Drucker", "Otis Watson", R.drawable.jason_ian_druker),
                    Cast("Pamela Adlon", "Sally Watson", R.drawable.pamela_adlon)
                ),
                "On the run in the year 1987, Bumblebee finds refuge in a junkyard in a small Californian beach town. Charlie, on the cusp of turning 18 and trying to find her place in the world, discovers Bumblebee, battle-scarred and broken. When Charlie revives him, she quickly learns this is no ordinary yellow VW bug.",
                "\$135.000.000", "\$465.895.025",
                arrayOf("technology", "based on toy", "transformers", "robot", "spin off", "1980s", "autobot")
            ),
            Movie(
                "Creed II", R.drawable.poster_creed,
                "November 2018", "2h 10m",
                arrayOf("Drama"),
                mutableListOf(
                    Cast("Michael B. Jordan", "Adonis Creed", R.drawable.michael_jordan),
                    Cast("Sylvester Stallone", "Robert \"Rocky\" Balboa Sr.", R.drawable.sylvester_stallon),
                    Cast("Dolph Lundgren", "Ivan Drago", R.drawable.dolph_rundgren),
                    Cast("Florian Munteanu", "Viktor Drago", R.drawable.florian_munteanu),
                    Cast("Tessa Thompson", "Bianca Taylor", R.drawable.tessa_thompson)
                ),
                "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life.",
                "\$50.000.000", "\$137.944.327",
                arrayOf("ukraine", "sport", "sequel", "los angeles", "boxing", "kiev", "box ring")
            ),
            Movie(
                "Once Upon A Deadpool", R.drawable.poster_deadpool,
                "December 2018", "1h 57m",
                arrayOf("Komedi", "Aksi"),
                mutableListOf(
                    Cast("Ryan Reynolds", "Wade Wilson / Deadpool", R.drawable.ryan_reynolds),
                    Cast("Fred Savage", "Himself", R.drawable.fred_savage),
                    Cast("Josh Brolin", "Cable", R.drawable.josh_brolin),
                    Cast("Morena Baccarin", "Vanessa", R.drawable.morena_baccarin),
                    Cast("Julian Dennison", "Russell Collins / Firefist", R.drawable.julian_dennison)
                ),
                "A kidnapped Fred Savage is forced to endure Deadpool's PG-13 rendition of Deadpool 2 as a Princess Bride-esque story that's full of magic, wonder & zero F's.",
                "-", "-",
                arrayOf("based on comic", "christmas")
            ),
            Movie(
                "How to Train Your Dragon: The Hidden World", R.drawable.poster_dragon,
                "Februari 2019", "1h 44m",
                arrayOf("Animasi", "Keluarga", "Petualangan"),
                mutableListOf(
                    Cast("Jay Baruchel", "Hablaty", R.drawable.jay_baruchel),
                    Cast("America Ferrera", "Astrid", R.drawable.america_ferrrera),
                    Cast("F. Murray Abraham", "Mogor", R.drawable.f_muray_abraham),
                    Cast("Cate Blanchett", "Valka", R.drawable.cate_blanchet),
                    Cast("Gerard Butler", "Pléhpofa", R.drawable.gerard_butler)
                ),
                "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.",
                "\$129.000.000", "\$517.526.875",
                arrayOf(
                    "flying",
                    "based on novel or book",
                    "overpopulation",
                    "viking",
                    "finale",
                    "sequel",
                    "cgi",
                    "dragon",
                    "based on children's book"
                )
            ),
            Movie(
                "Glass", R.drawable.poster_glass,
                "Januari 2019", "2h 9m",
                arrayOf("Cerita Seru", "Misteri", "Drama"),
                mutableListOf(
                    Cast("James McAvoy", "Kevin Wendell Crumb / The Beast", R.drawable.james_mcavoy),
                    Cast("Bruce Willis", "David Dunn / The Overseer", R.drawable.bruce_willis),
                    Cast("Samuel L. Jackson", "Elijah Price / Mr. Glass", R.drawable.samuel_l_jackson),
                    Cast("Anya Taylor-Joy", "Casey Cooke", R.drawable.anya_taylor),
                    Cast("Sarah Paulson", "Dr. Ellie Staple", R.drawable.sarah_paulson)
                ),
                "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
                "\$20.000.000", "\$246.941.965",
                arrayOf(
                    "sequel",
                    "superhero",
                    "psychiatric hospital",
                    "comic book shop",
                    "super power",
                    "mental illness",
                    "multiple personality",
                    "dissociative identity disorder",
                    "surveillance specialist"
                )
            ),
            Movie(
                "Hunter Killer", R.drawable.poster_hunterkiller,
                "Oktober 2018", "2h 2m",
                arrayOf("Aksi", "Cerita Seru"),
                mutableListOf(
                    Cast("Gerard Butler", "Captain Joe Glass", R.drawable.gerard_butler),
                    Cast("Gary Oldman", "CJCS Charles Donnegan", R.drawable.gary_oldman),
                    Cast("Toby Stephens", "Bill Beaman", R.drawable.toby_stephen),
                    Cast("Common", "RA John Fisk", R.drawable.common),
                    Cast("Linda Cardellini", "Jane Norquist", R.drawable.linda_cardellini)
                ),
                "Captain Glass of the USS Arkansas discovers that a coup d'état is taking place in Russia, so he and his crew join an elite group working on the ground to prevent a war.",
                "-", "-",
                arrayOf(
                    "submarine",
                    "washington d.c.",
                    "sniper",
                    "pentagon",
                    "u.s. navy",
                    "special forces",
                    "russian army",
                    "naval base",
                    "russian president",
                    "post cold war"
                )
            ),
            Movie(
                "Marry Poppins Returns", R.drawable.poster_marrypopins,
                "December 2018", "2h 11m",
                arrayOf("Fantasi", "Keluarga", "Komedi"),
                mutableListOf(
                    Cast("Emily Blunt", "Mary Poppins", R.drawable.emily_blunt),
                    Cast("Lin-Manuel Miranda", "Jack", R.drawable.lin_manuel),
                    Cast("Ben Whishaw", "Michael Banks", R.drawable.ben_whishaw),
                    Cast("Emily Mortimer", "Jane Banks", R.drawable.emily_mortimer),
                    Cast("Pixie Davies", "Annabel Banks", R.drawable.pixie_davis)
                ),
                "In Depression-era London, a now-grown Jane and Michael Banks, along with Michael's three children, are visited by the enigmatic Mary Poppins following a personal loss. Through her unique magical skills, and with the aid of her friend Jack, she helps the family rediscover the joy and wonder missing in their lives.",
                "\$130.000.000", "\$348.807.090",
                arrayOf(
                    "london",
                    "based on novel or book",
                    "nanny",
                    "magic",
                    "musical",
                    "sequel",
                    "family relationships",
                    "animated sequence",
                    "female protagonist",
                    "singing",
                    "housekeeper",
                    "discipline",
                    "depression era",
                    "charm",
                    "live action and animation",
                    "1930s"
                )
            ),
            Movie(
                "Mortal Engines", R.drawable.poster_mortalengine,
                "November 2018", "2h 9m",
                arrayOf("Petualangan", "Fantasi"),
                mutableListOf(
                    Cast("Hera Hilmar", "Hester Shaw", R.drawable.hera_hilmar),
                    Cast("Robert Sheehan", "Tom Natsworthy", R.drawable.robert_sheehan),
                    Cast("Hugo Weaving", "Thaddeus Valentine", R.drawable.hugo_weaving),
                    Cast("Jihae", "Anna Fang", R.drawable.jihae),
                    Cast("Ronan Raftery", "Bevis Pod", R.drawable.ronan_raftery)
                ),
                "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever.",
                "\$100.000.000", "\$104.236.467",
                arrayOf(
                    "based on novel or book",
                    "post-apocalyptic",
                    "dystopia",
                    "revenge",
                    "steampunk",
                    "wasteland",
                    "futuristic vehicle",
                    "based on young adult novel"
                )
            ),
            Movie(
                "Preman Pensiun The Movie", R.drawable.poster_preman,
                "Januari 2019", "1h 34m",
                arrayOf("Komedi", "Drama"),
                mutableListOf(
                    Cast("Epy Kusnandar", "Kang Mus", R.drawable.epy_kusnandar),
                    Cast("Tya Arifin", "Kinanti", R.drawable.default_profile),
                    Cast("Soraya Rasyid", "Imas", R.drawable.default_profile),
                    Cast("Andra Manihot", "Dikdik", R.drawable.default_profile),
                    Cast("Sandi Tile", "Amin", R.drawable.default_profile)
                    ),
                "Gobang kembali ke Bandung, mengundang teman-temannya, para mantan preman untuk bertemu kembali. Mereka yang diundang adalah Ujang, Murad, Pipit, Cecep, Bohim, Mang Uu, Dikdik dan Joni. Dikdik kemudian tidak jadi datang karena masalah dengan istrinya. Dalam pertemuan yang disebut “reuni kecil-kecilan” itu, Gobang meminta bantuan teman-temannya untuk melakukan penyelidikan, siapa pelaku pembantaian terhadap adik iparnya hingga tewas. Pelaku pembantaian kemudian diketahui adalah Darman dan kawan-kawan yang hanya sebagai orang suruhan. Dalang di balik kejadian itu ternyata teman mereka sendiri, sesama bekas anak buah Muslihat (Epy Kusnandar) yang sebenarnya juga sudah pensiun. Muslihat mencoba mencegah terjadinya perang saudara, tapi Gobang sudah terlanjur datang dengan membawa dendam, “darah dibayar darah, nyawa dibayar nyawa“",
                "-", "-",
                arrayOf("no keywords added")
            ),
            Movie(
                "Spider-Man: Into The Spider-Verse", R.drawable.poster_spiderman,
                "Desember 2018", "1h 57m",
                arrayOf("Aksi", "Petualangan", "Animasi", "Cerita Fiksi", "Komedi"),
                mutableListOf(
                    Cast("Shameik Moore", "Miles Morales / Spider-Man (voice)", R.drawable.shameik_moore),
                    Cast("Jake Johnson", "Peter B. Parker / Spider-Man (voice)", R.drawable.jake_johnson),
                    Cast("Hailee Steinfeld", "Gwen Stacy / Spider-Woman (voice)", R.drawable.hailee_steinfeld),
                    Cast("Mahershala Ali", "Aaron Davis / Prowler (voice)", R.drawable.mahershala_ali),
                    Cast("Brian Tyree Henry", "Jefferson Davis (voice)", R.drawable.brian_tyree_henry)
                ),
                "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
                "\$90.000.000", "\$375.450.417",
                arrayOf("superhero", "based on comic", "aftercreditsstinger", "alternate universe")
            )
        )

        fun getData(): MutableList<Movie> {
            return data
        }
    }
}
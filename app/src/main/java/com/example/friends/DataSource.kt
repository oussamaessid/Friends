package com.example.friends


object DataSource  {

        fun createDataSet(): ArrayList<Constant> {
            val list = ArrayList<Constant>()
            list.add(
                Constant(
                    "1",
                    "Quelle est ta couleur préférée ?"
                )
            )
            list.add(
                Constant(
                    "2",
                    "Plage, campagne ou montagne ?"
                )
            )

            list.add(
                Constant(
                    "3",
                    "Est-ce que tu es introverti ou extraverti ?"
                )
            )
            list.add(
                Constant(
                    "4",
                    "Tu es plutôt chien ou chat ?"
                )
            )
            list.add(
                Constant(
                    "5",
                    "Quel est ton film préféré ?"
                )
            )
            list.add(
                Constant(
                    "6",
                    "Que ferais-tu si tu avais 1 million d’euro ? "

                )
            )
            list.add(
                Constant(
                    "7",
                    "Quel métier voulais-tu faire quand tu étais enfant ?"
                )
            )
            list.add(
                Constant(
                    "8",
                    "Es-tu du matin ou du soir ?"
                )
            )
            list.add(
                Constant(
                    "9",
                    "Quel est le premier concert où tu es allé ?"
                )
            )

            return list

        }

}


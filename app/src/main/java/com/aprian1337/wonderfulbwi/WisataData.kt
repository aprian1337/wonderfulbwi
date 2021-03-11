package com.aprian1337.wonderfulbwi

object WisataData {
    private val wisataNames = arrayOf(
        "Bangsring Underwater",
        "Boom Beach",
        "De Djawatan Forest",
        "Ijen Crater",
        "Mustika Beach",
        "Pancur Beach",
        "Plengkung Beach",
        "Red Island Beach",
        "Green Bay Beach",
        "Wedi Ireng Beach",
        "Terracotta Gandrung Park"
    )

    private val wisataDetails = arrayOf(
        "Bangsring Underwater or commonly referred to as Bunder is a tour in Banyuwangi based on natural coral reef conservation. There are natural and artificial coral reefs. This place was created as a result of the hard work of the local village fishermen. In addition, there is a Floating House which has a shark conservation concept in the middle of the Bangsring Underwater sea tour. Visitors can also enjoy snorkeling or together safely in the sea.",
        "Boom Beach is a beach located in Kampung Mandar Village, Banyuwangi District, Banyuwangi, East Java. This beach was formerly a former port. This beach is one of the destinations to gather for young people in Banyuwangi. Currently Boom Beach is transformed into a friendly tour for anyone with facilities and of course it is highly recommended for tourists who want to visit Banyuwangi. There is also a photogenic bridge that went viral some time ago.",
        "De Djawatan is a tour located in Benculuk Village, Cluring District. This forest was only known as an ordinary forest by the local population, under the name Djawatan Benculuk. However, due to the large tourism potential of this forest, this forest has been transformed into a forest that has an attractive appeal. There are about 50 large tamarind trees left by the Dutch that are still alive on this 3.8 hectare land. Benalu or ferns that live on the trunk make this tamarind tree look ancient and haunted which has its own charm for tourists, especially those who like photography.",
        "Ijen Crater is a volcano located on the border between Banyuwangi and Bondowoso Regencies, East Java. This mountain has an altitude of 2,386 meters above sea level and is located side by side with Mount Merapi. Having more than two thousand visitors every month, Ijen Crater is a tourist spot that makes a lot of people curious, especially with the appearance of the blue fire where not all mountains exist. The blue fire is a special attraction for tourists, but tourists must reach the peak before sunrise if they want to see the blue fire clearly. ",
        "Mustika Beach lies in the Sumberagung Village, Pesanggaran District. This beach is unique in the form of a very wide stretch of golden sand. In addition, this shoreline forms like a semicircle, a very charming beach. However, Mustika Beach is still classified as a quiet beach because there are still many people who know about this hidden tour. To go to this beach, tourists only need to pay a cheap parking fee. Tourists can see the beauty of the sea which is still cool and also has minimal trash on this amazing beach",
        "Pancur Beach is a member of the Alas Purwo National Park. The location is about 5 km from Pos Rawabendo, the entrance to Alas Purwo National Park, or 2 km from Trianggulasi beach. The name Pancur is taken from a small river or waterfall that flows into the sand and flows directly into the wide sea. Pancur beach has a long coastline with medium wave and wide ground suitable for families. In addition, Pancur Beach also has a very long stretch of white sand, the beach is sloping and safe for small children",
        "Plengkung Beach, better known as G-Land, is a beach located in the Alas Purwo National Park area. This beach can also be reached by rental boat from Bali. This beach is very popular for local and foreign tourists, especially for surfers. Due to the big waves, this beach is a paradise for surfers to enjoy big and high waves. Plengkung Beach is also recognized as the best surfing spot in Southeast Asia and the waves are among the best in the world. You must try the sensation of surfing at Plengkung Beach if you like surfing",
        "The Red Island Beach is located in the south part of Banyuwangi Regency. The name Pulau Merah Beach comes from the presence of a small hill and is composed of red soil, this hill is located near the beach. This beach is a favorite destination for young people to spend their time on vacation or just enjoying the waves and beach breeze. The atmosphere of the beach is also conjured in such a way that it is similar to the atmosphere of the beach in Bali. In addition, this beach is also one of the destinations for surfers to surf. Therefore, there are many foreign tourists there",
        "Teluk Ijo Beach is a beach located in Sarongan Village, Pesanggaran Subdistrict. This beach is the belle of local residents, because this beach is still not many people who know the beauty of this beach. The location of the beach is also hidden and there is still a lack of clues to get to this place. Tourists can enjoy 8 meters of steep water and beautiful coral views. The sea water on this beach also looks green and clean, making tourists feel at home visiting here. To get to this place, visitors have two access options, namely using the sea route or using the land route which means climbing a mountain",
        "Wedi ireng beach, which is in the Meru Betiri National Park area, has a distorted beauty that will spoil the eye. Wedi Ireng Beach has a very remote location, even access to the Wedi Ireng Beach tourist attraction is quite challenging. This beach has blue water and very clear sea water and has a combination of white and black sand as typical of this Wedi Ireng beach.",
        "The Terracotta Gandrung Park is the site of a thousand pottery statues located on a stretch of rice fields. The statue seems to be dancing a traditional Banyuwangi dance, namely the Gandrung Dance. Gandrung has also become an icon of Banyuwangi Regency until long ago, this dance is very unique to Banyuwangi. Terracotta not only presents rows of gandrung dancer statues, but also presents natural attractions with rice fields, farmers plowing rice fields, coffee gardens and of course the very cool wind that attracts tourists to visit this tour"
    )

    private val wisataImages = intArrayOf(
        R.drawable.bangsring,
        R.drawable.boom,
        R.drawable.djawatan,
        R.drawable.ijen,
        R.drawable.mustika,
        R.drawable.pancur,
        R.drawable.plengkung,
        R.drawable.pulaumerah,
        R.drawable.telukhijau,
        R.drawable.wediireng,
        R.drawable.terakota
    )

    val listData: ArrayList<Wisata>
        get() {
            val list = arrayListOf<Wisata>()
            for (position in wisataNames.indices) {
                val wisata = Wisata()
                wisata.name = wisataNames[position]
                wisata.detail = wisataDetails[position]
                wisata.photo = wisataImages[position]
                list.add(wisata)
            }
            return list
        }
}
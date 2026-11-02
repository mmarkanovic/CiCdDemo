package hr.markanovic.cicddemo

/**
 * Računa prosjek ocjena (1–5), zaokružen na dvije decimale.
 * Baca iznimku ako je popis prazan ili sadrži neispravnu ocjenu.
 */
fun prosjekOcjena(ocjene: List<Int>): Double {
    require(ocjene.isNotEmpty()) { "Popis ocjena je prazan" }
    require(ocjene.all { it in 1..5 }) { "Ocjena mora biti između 1 i 5" }
    return Math.round(ocjene.average() * 100) / 100.0
}
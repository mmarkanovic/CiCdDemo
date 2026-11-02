package hr.markanovic.cicddemo

import org.junit.Assert.assertEquals
import org.junit.Assert.assertThrows
import org.junit.Test

class OcjeneTest {

    @Test
    fun prosjekIspravnihOcjena() {
        assertEquals(4.5, prosjekOcjena(listOf(5, 4, 3)), 0.001)
    }

    @Test
    fun prosjekSeZaokruzujeNaDvijeDecimale() {
        assertEquals(4.67, prosjekOcjena(listOf(5, 5, 4)), 0.001)
    }

    @Test
    fun prazanPopisBacaIznimku() {
        assertThrows(IllegalArgumentException::class.java) {
            prosjekOcjena(emptyList())
        }
    }

    @Test
    fun ocjenaIzvanRasponaBacaIznimku() {
        assertThrows(IllegalArgumentException::class.java) {
            prosjekOcjena(listOf(5, 6))
        }
    }
}
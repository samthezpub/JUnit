package org.example;

import org.example.WeightConventer.WeightConverter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WeightConverterTest {

    @Test
    void WeightConverter_MilligramsToGramsMustReturnDouble_ValidConversion_WhenCalled() {
        assertEquals(1, WeightConverter.milligramsToGrams(1000));
    }

    @Test
    void WeightConverter_GramsToKilogramsMustReturnDouble_ValidConversion_WhenCalled() {
        assertEquals(1, WeightConverter.gramsToKilograms(1000));
    }

    @Test
    void WeightConverter_KilogramsToCentnersMustReturnDouble_ValidConversion_WhenCalled() {
        assertEquals(1, WeightConverter.kilogramsToCentners(100));
    }

    @Test
    void WeightConverter_CentnersToTonnesMustReturnDouble_ValidConversion_WhenCalled() {
        assertEquals(1, WeightConverter.centnersToTonnes(10));
    }

    @Test
    void WeightConverter_TonnesToKilogramsMustReturnDouble_ValidConversion_WhenCalled() {
        assertEquals(1000, WeightConverter.tonnesToKilograms(1));
    }
}



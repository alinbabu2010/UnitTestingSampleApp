package com.sample.unittest

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class ResourceComparerTest {

    private lateinit var resourceComparer: ResourceComparer
    private lateinit var context: Context

    @Before
    fun setup() {
        resourceComparer = ResourceComparer()
        context = ApplicationProvider.getApplicationContext()
    }

    @Test
    fun stringResourceSameAsGivenString_returnsTrue() {
        val result = resourceComparer.isEqual(context, R.string.app_name, "UnitTestSampleApp")
        assertThat(result).isTrue()
    }

    @Test
    fun stringResourceDifferentAsGivenString_returnsFalse() {
        val result = resourceComparer.isEqual(context, R.string.app_name, "SampleApp")
        assertThat(result).isFalse()
    }

}
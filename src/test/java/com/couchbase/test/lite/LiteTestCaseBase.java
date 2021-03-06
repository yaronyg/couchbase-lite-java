package com.couchbase.test.lite;

import junit.framework.*;

/**
 * This class is changed depending on if we are in Android or Java. Amongst other things it lets us
 * change the base class for tests between TestCase (Java) and AndroidTestCase (Android).
 *
 * Reference Issue: https://github.com/couchbase/couchbase-lite-android/issues/285
 */
public class LiteTestCaseBase extends TestCase {

    public void testLiteTestCaseSetupProperly() {
        // Avoid No tests found Assertion Failed Error.
    }
}

package org.fcrepo.test.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ FixityTest.class, IndirectTest.class, NestedTest.class, SparqlTest.class, TransactionTest.class,
    VersionTest.class })
public class Fcrepo4TestSuite {

}

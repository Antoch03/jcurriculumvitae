
//=========================================
// Name         : TestLatexCreator.java 
// Author       : Anthony Rey
// Version      : 1.0.0.0
// Date         : 17/08/2019
// Update       : 17/08/2019
// Description  : Test of the LatexCreator class
// Copyright    : Copyright (c) 2019 by Anthony Rey
// License      : Creative Common Attribution-ShareAlike 4.0 International
//========================================

//========================================
// Links
//========================================

//

//========================================
// Packages
//========================================

package com.core;

// Java core packages


// Java extension packages
import org.junit.*;
import static org.junit.Assert.*;


/**
 * <tt>TestLatexCreator</tt> provides a test for the LatexCreator class
 * @author <a href = "mailto:anthonyrey.simonnot@gmail.com">Anthony Rey</a>
 * @version TestLatexCreator 1.0.0.0 (August 17, 2019)
 */
public class TestJCurriculumVitae {

    // Fields  
    
	private JCurriculumVitae jcurriculumvitae;

    // Constructors 
    

    // Methods
   
    // Set up 
    @Before 
    public void setUp() {
        jcurriculumvitae = new JCurriculumVitae();
    } // End setUp method 
     
    // Test 
    @Test 
    public void testPrintLatexPreamble() {
        int value = jcurriculumvitae.returnOne();    
        assertEquals(value,1); 
   } // End testPrintLatexPreamble method 
   
    // Tear down
    @After
    public void tearDown() {
        // Do nothing so far
    } // End tearDown method 

} // End TestLatexCreator class



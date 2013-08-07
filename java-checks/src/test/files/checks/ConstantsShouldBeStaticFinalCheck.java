class A {
  private final int f1 = 0;                             // Non-Compliant
  private final static int f2 = 0;                      // Compliant
  private static final int f3 = 0;                      // Compliant
  public final int f4 = MyEnumOrInterface.MY_CONSTANT;  // Non-Compliant
  private final int f5 = new Date();                    // Compliant
  private final int f6 = foo();                         // Compliant
  private int f7 = 0;                                   // Compliant
  private int f8;                                       // Compliant
  private final int f9;                                 // Compliant
  private final int
   f10 = 0,                                             // Non-Compliant
   f11,                                                 // Compliant
   f12 = foo(),                                         // Compliant
   f13 = BAR;                                           // Non-Compliant

  private final int[] foo = new int[42];                // Compliant
}

interface B {
  final int f0 = 0;                                     // Compliant
}

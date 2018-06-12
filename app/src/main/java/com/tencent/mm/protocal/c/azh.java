package com.tencent.mm.protocal.c;

public final class azh
  extends com.tencent.mm.bk.a
{
  public String csK;
  public String csL;
  public double latitude;
  public double longitude;
  public long raY;
  public String raZ;
  public String rba;
  public String rbb;
  public String rbc;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.csK != null) {
        paramVarArgs.g(1, this.csK);
      }
      if (this.csL != null) {
        paramVarArgs.g(2, this.csL);
      }
      paramVarArgs.c(3, this.latitude);
      paramVarArgs.c(4, this.longitude);
      paramVarArgs.T(5, this.raY);
      if (this.raZ != null) {
        paramVarArgs.g(6, this.raZ);
      }
      if (this.rba != null) {
        paramVarArgs.g(7, this.rba);
      }
      if (this.rbb != null) {
        paramVarArgs.g(8, this.rbb);
      }
      if (this.rbc != null) {
        paramVarArgs.g(9, this.rbc);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.csK == null) {
        break label571;
      }
    }
    label571:
    for (paramInt = f.a.a.b.b.a.h(1, this.csK) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.csL != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.csL);
      }
      i = i + (f.a.a.b.b.a.ec(3) + 8) + (f.a.a.b.b.a.ec(4) + 8) + f.a.a.a.S(5, this.raY);
      paramInt = i;
      if (this.raZ != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.raZ);
      }
      i = paramInt;
      if (this.rba != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.rba);
      }
      paramInt = i;
      if (this.rbb != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rbb);
      }
      i = paramInt;
      if (this.rbc != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.rbc);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        azh localazh = (azh)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localazh.csK = locala.vHC.readString();
          return 0;
        case 2: 
          localazh.csL = locala.vHC.readString();
          return 0;
        case 3: 
          localazh.latitude = locala.vHC.readDouble();
          return 0;
        case 4: 
          localazh.longitude = locala.vHC.readDouble();
          return 0;
        case 5: 
          localazh.raY = locala.vHC.rZ();
          return 0;
        case 6: 
          localazh.raZ = locala.vHC.readString();
          return 0;
        case 7: 
          localazh.rba = locala.vHC.readString();
          return 0;
        case 8: 
          localazh.rbb = locala.vHC.readString();
          return 0;
        }
        localazh.rbc = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/azh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
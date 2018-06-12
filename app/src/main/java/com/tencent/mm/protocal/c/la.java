package com.tencent.mm.protocal.c;

public final class la
  extends com.tencent.mm.bk.a
{
  public float bSx;
  public float bUg;
  public String country;
  public String csK;
  public String csL;
  public String dRH;
  public String descriptor;
  public String hvl;
  public String hwI;
  public String name;
  public float rnu;
  public String rnv;
  public String rnw;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.name != null) {
        paramVarArgs.g(1, this.name);
      }
      if (this.descriptor != null) {
        paramVarArgs.g(2, this.descriptor);
      }
      if (this.hvl != null) {
        paramVarArgs.g(3, this.hvl);
      }
      if (this.country != null) {
        paramVarArgs.g(4, this.country);
      }
      if (this.csK != null) {
        paramVarArgs.g(5, this.csK);
      }
      if (this.csL != null) {
        paramVarArgs.g(6, this.csL);
      }
      if (this.dRH != null) {
        paramVarArgs.g(7, this.dRH);
      }
      paramVarArgs.l(8, this.rnu);
      paramVarArgs.l(9, this.bUg);
      paramVarArgs.l(10, this.bSx);
      if (this.hwI != null) {
        paramVarArgs.g(11, this.hwI);
      }
      if (this.rnv != null) {
        paramVarArgs.g(12, this.rnv);
      }
      if (this.rnw != null) {
        paramVarArgs.g(13, this.rnw);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.name == null) {
        break label795;
      }
    }
    label795:
    for (int i = f.a.a.b.b.a.h(1, this.name) + 0;; i = 0)
    {
      paramInt = i;
      if (this.descriptor != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.descriptor);
      }
      i = paramInt;
      if (this.hvl != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.hvl);
      }
      paramInt = i;
      if (this.country != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.country);
      }
      i = paramInt;
      if (this.csK != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.csK);
      }
      paramInt = i;
      if (this.csL != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.csL);
      }
      i = paramInt;
      if (this.dRH != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.dRH);
      }
      i = i + (f.a.a.b.b.a.ec(8) + 4) + (f.a.a.b.b.a.ec(9) + 4) + (f.a.a.b.b.a.ec(10) + 4);
      paramInt = i;
      if (this.hwI != null) {
        paramInt = i + f.a.a.b.b.a.h(11, this.hwI);
      }
      i = paramInt;
      if (this.rnv != null) {
        i = paramInt + f.a.a.b.b.a.h(12, this.rnv);
      }
      paramInt = i;
      if (this.rnw != null) {
        paramInt = i + f.a.a.b.b.a.h(13, this.rnw);
      }
      return paramInt;
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
        la localla = (la)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localla.name = locala.vHC.readString();
          return 0;
        case 2: 
          localla.descriptor = locala.vHC.readString();
          return 0;
        case 3: 
          localla.hvl = locala.vHC.readString();
          return 0;
        case 4: 
          localla.country = locala.vHC.readString();
          return 0;
        case 5: 
          localla.csK = locala.vHC.readString();
          return 0;
        case 6: 
          localla.csL = locala.vHC.readString();
          return 0;
        case 7: 
          localla.dRH = locala.vHC.readString();
          return 0;
        case 8: 
          localla.rnu = locala.vHC.readFloat();
          return 0;
        case 9: 
          localla.bUg = locala.vHC.readFloat();
          return 0;
        case 10: 
          localla.bSx = locala.vHC.readFloat();
          return 0;
        case 11: 
          localla.hwI = locala.vHC.readString();
          return 0;
        case 12: 
          localla.rnv = locala.vHC.readString();
          return 0;
        }
        localla.rnw = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/la.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
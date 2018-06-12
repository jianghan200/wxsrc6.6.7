package com.tencent.mm.protocal.c;

public final class axa
  extends com.tencent.mm.bk.a
{
  public String ecE;
  public int rko;
  public int rth;
  public int ruE;
  public int saf;
  public int sag;
  public String sah;
  public int sai;
  public String saj;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.ecE != null) {
        paramVarArgs.g(1, this.ecE);
      }
      paramVarArgs.fT(2, this.saf);
      paramVarArgs.fT(3, this.sag);
      paramVarArgs.fT(4, this.rko);
      if (this.sah != null) {
        paramVarArgs.g(5, this.sah);
      }
      paramVarArgs.fT(6, this.ruE);
      paramVarArgs.fT(7, this.sai);
      paramVarArgs.fT(8, this.rth);
      if (this.saj != null) {
        paramVarArgs.g(9, this.saj);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.ecE == null) {
        break label523;
      }
    }
    label523:
    for (paramInt = f.a.a.b.b.a.h(1, this.ecE) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.saf) + f.a.a.a.fQ(3, this.sag) + f.a.a.a.fQ(4, this.rko);
      paramInt = i;
      if (this.sah != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.sah);
      }
      i = paramInt + f.a.a.a.fQ(6, this.ruE) + f.a.a.a.fQ(7, this.sai) + f.a.a.a.fQ(8, this.rth);
      paramInt = i;
      if (this.saj != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.saj);
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
        axa localaxa = (axa)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localaxa.ecE = locala.vHC.readString();
          return 0;
        case 2: 
          localaxa.saf = locala.vHC.rY();
          return 0;
        case 3: 
          localaxa.sag = locala.vHC.rY();
          return 0;
        case 4: 
          localaxa.rko = locala.vHC.rY();
          return 0;
        case 5: 
          localaxa.sah = locala.vHC.readString();
          return 0;
        case 6: 
          localaxa.ruE = locala.vHC.rY();
          return 0;
        case 7: 
          localaxa.sai = locala.vHC.rY();
          return 0;
        case 8: 
          localaxa.rth = locala.vHC.rY();
          return 0;
        }
        localaxa.saj = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/axa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
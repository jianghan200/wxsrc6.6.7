package com.tencent.mm.protocal.c;

public final class bkd
  extends com.tencent.mm.bk.a
{
  public com.tencent.mm.bk.b rwb;
  public int sjL;
  public int sjM;
  public int sjN;
  public int sjO;
  public int sjP;
  public int sjQ;
  public int sjR;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rwb == null) {
        throw new f.a.a.b("Not all required fields were included: data");
      }
      paramVarArgs.fT(1, this.sjL);
      paramVarArgs.fT(2, this.sjM);
      paramVarArgs.fT(3, this.sjN);
      paramVarArgs.fT(4, this.sjO);
      paramVarArgs.fT(5, this.sjP);
      paramVarArgs.fT(6, this.sjQ);
      paramVarArgs.fT(7, this.sjR);
      if (this.rwb != null) {
        paramVarArgs.b(8, this.rwb);
      }
      paramInt = 0;
    }
    int i;
    do
    {
      return paramInt;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.sjL) + 0 + f.a.a.a.fQ(2, this.sjM) + f.a.a.a.fQ(3, this.sjN) + f.a.a.a.fQ(4, this.sjO) + f.a.a.a.fQ(5, this.sjP) + f.a.a.a.fQ(6, this.sjQ) + f.a.a.a.fQ(7, this.sjR);
      paramInt = i;
    } while (this.rwb == null);
    return i + f.a.a.a.a(8, this.rwb);
    f.a.a.a.a locala;
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      locala = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(locala); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(locala)) {
        if (!super.a(locala, this, paramInt)) {
          locala.cJS();
        }
      }
      if (paramVarArgs == null) {
        throw new f.a.a.b("Not all required fields were included: data");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      locala = (f.a.a.a.a)paramVarArgs[0];
      bkd localbkd = (bkd)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localbkd.sjL = locala.vHC.rY();
        return 0;
      case 2: 
        localbkd.sjM = locala.vHC.rY();
        return 0;
      case 3: 
        localbkd.sjN = locala.vHC.rY();
        return 0;
      case 4: 
        localbkd.sjO = locala.vHC.rY();
        return 0;
      case 5: 
        localbkd.sjP = locala.vHC.rY();
        return 0;
      case 6: 
        localbkd.sjQ = locala.vHC.rY();
        return 0;
      case 7: 
        localbkd.sjR = locala.vHC.rY();
        return 0;
      }
      localbkd.rwb = locala.cJR();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/bkd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
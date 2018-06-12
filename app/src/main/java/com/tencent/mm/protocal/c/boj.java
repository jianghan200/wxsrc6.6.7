package com.tencent.mm.protocal.c;

public final class boj
  extends com.tencent.mm.bk.a
{
  public String hbL;
  public int rTo;
  public String smq;
  public int smr;
  public String sms;
  public int smt;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.smq != null) {
        paramVarArgs.g(1, this.smq);
      }
      paramVarArgs.fT(2, this.smr);
      if (this.hbL != null) {
        paramVarArgs.g(3, this.hbL);
      }
      if (this.sms != null) {
        paramVarArgs.g(4, this.sms);
      }
      paramVarArgs.fT(5, this.rTo);
      paramVarArgs.fT(6, this.smt);
      return 0;
    }
    if (paramInt == 1) {
      if (this.smq == null) {
        break label402;
      }
    }
    label402:
    for (paramInt = f.a.a.b.b.a.h(1, this.smq) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.smr);
      paramInt = i;
      if (this.hbL != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.hbL);
      }
      i = paramInt;
      if (this.sms != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.sms);
      }
      return i + f.a.a.a.fQ(5, this.rTo) + f.a.a.a.fQ(6, this.smt);
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
        boj localboj = (boj)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localboj.smq = locala.vHC.readString();
          return 0;
        case 2: 
          localboj.smr = locala.vHC.rY();
          return 0;
        case 3: 
          localboj.hbL = locala.vHC.readString();
          return 0;
        case 4: 
          localboj.sms = locala.vHC.readString();
          return 0;
        case 5: 
          localboj.rTo = locala.vHC.rY();
          return 0;
        }
        localboj.smt = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/boj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.protocal.c;

public final class bbc
  extends com.tencent.mm.bk.a
{
  public String peY;
  public int rNB;
  public String rvK;
  public String sdq;
  public String sdr;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.sdq != null) {
        paramVarArgs.g(1, this.sdq);
      }
      if (this.sdr != null) {
        paramVarArgs.g(2, this.sdr);
      }
      if (this.peY != null) {
        paramVarArgs.g(3, this.peY);
      }
      if (this.rvK != null) {
        paramVarArgs.g(4, this.rvK);
      }
      paramVarArgs.fT(5, this.rNB);
      return 0;
    }
    if (paramInt == 1) {
      if (this.sdq == null) {
        break label379;
      }
    }
    label379:
    for (int i = f.a.a.b.b.a.h(1, this.sdq) + 0;; i = 0)
    {
      paramInt = i;
      if (this.sdr != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.sdr);
      }
      i = paramInt;
      if (this.peY != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.peY);
      }
      paramInt = i;
      if (this.rvK != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rvK);
      }
      return paramInt + f.a.a.a.fQ(5, this.rNB);
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
        bbc localbbc = (bbc)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbbc.sdq = locala.vHC.readString();
          return 0;
        case 2: 
          localbbc.sdr = locala.vHC.readString();
          return 0;
        case 3: 
          localbbc.peY = locala.vHC.readString();
          return 0;
        case 4: 
          localbbc.rvK = locala.vHC.readString();
          return 0;
        }
        localbbc.rNB = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/bbc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
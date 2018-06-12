package com.tencent.mm.protocal.c;

public final class ep
  extends com.tencent.mm.bk.a
{
  public String eJK;
  public String hbL;
  public String hcS;
  public int joi;
  public String rbW;
  public int rfa;
  public String rfb;
  public String rfc;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rbW != null) {
        paramVarArgs.g(1, this.rbW);
      }
      if (this.hcS != null) {
        paramVarArgs.g(2, this.hcS);
      }
      if (this.hbL != null) {
        paramVarArgs.g(3, this.hbL);
      }
      paramVarArgs.fT(4, this.rfa);
      if (this.rfb != null) {
        paramVarArgs.g(5, this.rfb);
      }
      if (this.eJK != null) {
        paramVarArgs.g(6, this.eJK);
      }
      if (this.rfc != null) {
        paramVarArgs.g(7, this.rfc);
      }
      paramVarArgs.fT(8, this.joi);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rbW == null) {
        break label536;
      }
    }
    label536:
    for (int i = f.a.a.b.b.a.h(1, this.rbW) + 0;; i = 0)
    {
      paramInt = i;
      if (this.hcS != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.hcS);
      }
      i = paramInt;
      if (this.hbL != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.hbL);
      }
      i += f.a.a.a.fQ(4, this.rfa);
      paramInt = i;
      if (this.rfb != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rfb);
      }
      i = paramInt;
      if (this.eJK != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.eJK);
      }
      paramInt = i;
      if (this.rfc != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.rfc);
      }
      return paramInt + f.a.a.a.fQ(8, this.joi);
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
        ep localep = (ep)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localep.rbW = locala.vHC.readString();
          return 0;
        case 2: 
          localep.hcS = locala.vHC.readString();
          return 0;
        case 3: 
          localep.hbL = locala.vHC.readString();
          return 0;
        case 4: 
          localep.rfa = locala.vHC.rY();
          return 0;
        case 5: 
          localep.rfb = locala.vHC.readString();
          return 0;
        case 6: 
          localep.eJK = locala.vHC.readString();
          return 0;
        case 7: 
          localep.rfc = locala.vHC.readString();
          return 0;
        }
        localep.joi = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/ep.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
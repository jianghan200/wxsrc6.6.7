package com.tencent.mm.protocal.c;

public final class k
  extends com.tencent.mm.bk.a
{
  public long cfh;
  public String qYc;
  public String qYd;
  public String qYm;
  public int qYn;
  public String qYo;
  public String qYp;
  public int state;
  public String title;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.qYc != null) {
        paramVarArgs.g(1, this.qYc);
      }
      if (this.title != null) {
        paramVarArgs.g(2, this.title);
      }
      paramVarArgs.T(3, this.cfh);
      if (this.qYm != null) {
        paramVarArgs.g(5, this.qYm);
      }
      paramVarArgs.fT(10, this.state);
      paramVarArgs.fT(11, this.qYn);
      if (this.qYo != null) {
        paramVarArgs.g(12, this.qYo);
      }
      if (this.qYd != null) {
        paramVarArgs.g(13, this.qYd);
      }
      if (this.qYp != null) {
        paramVarArgs.g(14, this.qYp);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.qYc == null) {
        break label599;
      }
    }
    label599:
    for (paramInt = f.a.a.b.b.a.h(1, this.qYc) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.title != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.title);
      }
      i += f.a.a.a.S(3, this.cfh);
      paramInt = i;
      if (this.qYm != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.qYm);
      }
      i = paramInt + f.a.a.a.fQ(10, this.state) + f.a.a.a.fQ(11, this.qYn);
      paramInt = i;
      if (this.qYo != null) {
        paramInt = i + f.a.a.b.b.a.h(12, this.qYo);
      }
      i = paramInt;
      if (this.qYd != null) {
        i = paramInt + f.a.a.b.b.a.h(13, this.qYd);
      }
      paramInt = i;
      if (this.qYp != null) {
        paramInt = i + f.a.a.b.b.a.h(14, this.qYp);
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
        k localk = (k)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        case 4: 
        case 6: 
        case 7: 
        case 8: 
        case 9: 
        default: 
          return -1;
        case 1: 
          localk.qYc = locala.vHC.readString();
          return 0;
        case 2: 
          localk.title = locala.vHC.readString();
          return 0;
        case 3: 
          localk.cfh = locala.vHC.rZ();
          return 0;
        case 5: 
          localk.qYm = locala.vHC.readString();
          return 0;
        case 10: 
          localk.state = locala.vHC.rY();
          return 0;
        case 11: 
          localk.qYn = locala.vHC.rY();
          return 0;
        case 12: 
          localk.qYo = locala.vHC.readString();
          return 0;
        case 13: 
          localk.qYd = locala.vHC.readString();
          return 0;
        }
        localk.qYp = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
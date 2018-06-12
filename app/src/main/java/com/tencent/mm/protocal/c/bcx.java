package com.tencent.mm.protocal.c;

public final class bcx
  extends com.tencent.mm.bk.a
{
  public String rDt;
  public int rKb;
  public String rwt;
  public int rxJ;
  public int sfd;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rKb);
      if (this.rDt != null) {
        paramVarArgs.g(2, this.rDt);
      }
      if (this.rwt != null) {
        paramVarArgs.g(3, this.rwt);
      }
      paramVarArgs.fT(4, this.rxJ);
      paramVarArgs.fT(5, this.sfd);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = f.a.a.a.fQ(1, this.rKb) + 0;
      paramInt = i;
      if (this.rDt != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rDt);
      }
      i = paramInt;
      if (this.rwt != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rwt);
      }
      return i + f.a.a.a.fQ(4, this.rxJ) + f.a.a.a.fQ(5, this.sfd);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      bcx localbcx = (bcx)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localbcx.rKb = locala.vHC.rY();
        return 0;
      case 2: 
        localbcx.rDt = locala.vHC.readString();
        return 0;
      case 3: 
        localbcx.rwt = locala.vHC.readString();
        return 0;
      case 4: 
        localbcx.rxJ = locala.vHC.rY();
        return 0;
      }
      localbcx.sfd = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bcx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
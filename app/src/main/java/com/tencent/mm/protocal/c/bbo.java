package com.tencent.mm.protocal.c;

public final class bbo
  extends com.tencent.mm.bk.a
{
  public String info;
  public int rvt;
  public int rvu;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rvt);
      paramVarArgs.fT(2, this.rvu);
      if (this.info != null) {
        paramVarArgs.g(3, this.info);
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
      i = f.a.a.a.fQ(1, this.rvt) + 0 + f.a.a.a.fQ(2, this.rvu);
      paramInt = i;
    } while (this.info == null);
    return i + f.a.a.b.b.a.h(3, this.info);
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
      bbo localbbo = (bbo)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localbbo.rvt = locala.vHC.rY();
        return 0;
      case 2: 
        localbbo.rvu = locala.vHC.rY();
        return 0;
      }
      localbbo.info = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bbo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
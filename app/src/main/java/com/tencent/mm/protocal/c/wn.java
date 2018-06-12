package com.tencent.mm.protocal.c;

public final class wn
  extends com.tencent.mm.bk.a
{
  public String bJK;
  public String bWm;
  public int iVT;
  public String iVW;
  public int index;
  public int scene;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.scene);
      paramVarArgs.fT(2, this.iVT);
      paramVarArgs.fT(3, this.index);
      if (this.bJK != null) {
        paramVarArgs.g(4, this.bJK);
      }
      if (this.bWm != null) {
        paramVarArgs.g(5, this.bWm);
      }
      if (this.iVW != null) {
        paramVarArgs.g(6, this.iVW);
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
      i = f.a.a.a.fQ(1, this.scene) + 0 + f.a.a.a.fQ(2, this.iVT) + f.a.a.a.fQ(3, this.index);
      paramInt = i;
      if (this.bJK != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.bJK);
      }
      i = paramInt;
      if (this.bWm != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.bWm);
      }
      paramInt = i;
    } while (this.iVW == null);
    return i + f.a.a.b.b.a.h(6, this.iVW);
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
      wn localwn = (wn)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localwn.scene = locala.vHC.rY();
        return 0;
      case 2: 
        localwn.iVT = locala.vHC.rY();
        return 0;
      case 3: 
        localwn.index = locala.vHC.rY();
        return 0;
      case 4: 
        localwn.bJK = locala.vHC.readString();
        return 0;
      case 5: 
        localwn.bWm = locala.vHC.readString();
        return 0;
      }
      localwn.iVW = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/wn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
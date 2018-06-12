package com.tencent.mm.protocal.c;

public final class btb
  extends com.tencent.mm.bk.a
{
  public String lMY;
  public String path;
  public int showType;
  public String title;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.showType);
      if (this.title != null) {
        paramVarArgs.g(2, this.title);
      }
      if (this.lMY != null) {
        paramVarArgs.g(3, this.lMY);
      }
      if (this.path != null) {
        paramVarArgs.g(4, this.path);
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
      i = f.a.a.a.fQ(1, this.showType) + 0;
      paramInt = i;
      if (this.title != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.title);
      }
      i = paramInt;
      if (this.lMY != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.lMY);
      }
      paramInt = i;
    } while (this.path == null);
    return i + f.a.a.b.b.a.h(4, this.path);
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
      btb localbtb = (btb)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localbtb.showType = locala.vHC.rY();
        return 0;
      case 2: 
        localbtb.title = locala.vHC.readString();
        return 0;
      case 3: 
        localbtb.lMY = locala.vHC.readString();
        return 0;
      }
      localbtb.path = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/btb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.protocal.c;

public final class bcn
  extends com.tencent.mm.bk.a
{
  public String bKg;
  public String bRK;
  public boolean seI;
  public int seJ;
  public String url;
  public int version;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.av(1, this.seI);
      if (this.url != null) {
        paramVarArgs.g(2, this.url);
      }
      if (this.bKg != null) {
        paramVarArgs.g(3, this.bKg);
      }
      paramVarArgs.fT(4, this.version);
      paramVarArgs.fT(5, this.seJ);
      if (this.bRK != null) {
        paramVarArgs.g(6, this.bRK);
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
      i = f.a.a.b.b.a.ec(1) + 1 + 0;
      paramInt = i;
      if (this.url != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.url);
      }
      i = paramInt;
      if (this.bKg != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.bKg);
      }
      i = i + f.a.a.a.fQ(4, this.version) + f.a.a.a.fQ(5, this.seJ);
      paramInt = i;
    } while (this.bRK == null);
    return i + f.a.a.b.b.a.h(6, this.bRK);
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
      bcn localbcn = (bcn)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localbcn.seI = locala.cJQ();
        return 0;
      case 2: 
        localbcn.url = locala.vHC.readString();
        return 0;
      case 3: 
        localbcn.bKg = locala.vHC.readString();
        return 0;
      case 4: 
        localbcn.version = locala.vHC.rY();
        return 0;
      case 5: 
        localbcn.seJ = locala.vHC.rY();
        return 0;
      }
      localbcn.bRK = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/bcn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
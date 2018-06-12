package com.tencent.mm.protocal.c;

public final class asj
  extends com.tencent.mm.bk.a
{
  public int hcE;
  public long rUE;
  public long rUF;
  public String rjK;
  public String rlo;
  public int scene;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.scene);
      if (this.rjK != null) {
        paramVarArgs.g(2, this.rjK);
      }
      paramVarArgs.T(3, this.rUE);
      paramVarArgs.T(4, this.rUF);
      if (this.rlo != null) {
        paramVarArgs.g(5, this.rlo);
      }
      paramVarArgs.fT(6, this.hcE);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = f.a.a.a.fQ(1, this.scene) + 0;
      paramInt = i;
      if (this.rjK != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rjK);
      }
      i = paramInt + f.a.a.a.S(3, this.rUE) + f.a.a.a.S(4, this.rUF);
      paramInt = i;
      if (this.rlo != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rlo);
      }
      return paramInt + f.a.a.a.fQ(6, this.hcE);
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
      asj localasj = (asj)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localasj.scene = locala.vHC.rY();
        return 0;
      case 2: 
        localasj.rjK = locala.vHC.readString();
        return 0;
      case 3: 
        localasj.rUE = locala.vHC.rZ();
        return 0;
      case 4: 
        localasj.rUF = locala.vHC.rZ();
        return 0;
      case 5: 
        localasj.rlo = locala.vHC.readString();
        return 0;
      }
      localasj.hcE = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/asj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
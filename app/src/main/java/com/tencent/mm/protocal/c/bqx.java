package com.tencent.mm.protocal.c;

public final class bqx
  extends com.tencent.mm.bk.a
{
  public int egL;
  public String nIO;
  public String soZ;
  public int source;
  public String spa;
  public int spb;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.egL);
      if (this.soZ != null) {
        paramVarArgs.g(2, this.soZ);
      }
      if (this.spa != null) {
        paramVarArgs.g(3, this.spa);
      }
      paramVarArgs.fT(4, this.source);
      if (this.nIO != null) {
        paramVarArgs.g(5, this.nIO);
      }
      paramVarArgs.fT(6, this.spb);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = f.a.a.a.fQ(1, this.egL) + 0;
      paramInt = i;
      if (this.soZ != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.soZ);
      }
      i = paramInt;
      if (this.spa != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.spa);
      }
      i += f.a.a.a.fQ(4, this.source);
      paramInt = i;
      if (this.nIO != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.nIO);
      }
      return paramInt + f.a.a.a.fQ(6, this.spb);
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
      bqx localbqx = (bqx)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localbqx.egL = locala.vHC.rY();
        return 0;
      case 2: 
        localbqx.soZ = locala.vHC.readString();
        return 0;
      case 3: 
        localbqx.spa = locala.vHC.readString();
        return 0;
      case 4: 
        localbqx.source = locala.vHC.rY();
        return 0;
      case 5: 
        localbqx.nIO = locala.vHC.readString();
        return 0;
      }
      localbqx.spb = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/bqx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
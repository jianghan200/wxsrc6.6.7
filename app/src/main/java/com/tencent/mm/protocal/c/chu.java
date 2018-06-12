package com.tencent.mm.protocal.c;

public final class chu
  extends com.tencent.mm.bk.a
{
  public String bPS;
  public String sBN;
  public String sBO;
  public int sBP;
  public int sBQ;
  public int type;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.type);
      if (this.bPS != null) {
        paramVarArgs.g(2, this.bPS);
      }
      if (this.sBN != null) {
        paramVarArgs.g(3, this.sBN);
      }
      if (this.sBO != null) {
        paramVarArgs.g(4, this.sBO);
      }
      paramVarArgs.fT(5, this.sBP);
      paramVarArgs.fT(6, this.sBQ);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = f.a.a.a.fQ(1, this.type) + 0;
      paramInt = i;
      if (this.bPS != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.bPS);
      }
      i = paramInt;
      if (this.sBN != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.sBN);
      }
      paramInt = i;
      if (this.sBO != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.sBO);
      }
      return paramInt + f.a.a.a.fQ(5, this.sBP) + f.a.a.a.fQ(6, this.sBQ);
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
      chu localchu = (chu)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localchu.type = locala.vHC.rY();
        return 0;
      case 2: 
        localchu.bPS = locala.vHC.readString();
        return 0;
      case 3: 
        localchu.sBN = locala.vHC.readString();
        return 0;
      case 4: 
        localchu.sBO = locala.vHC.readString();
        return 0;
      case 5: 
        localchu.sBP = locala.vHC.rY();
        return 0;
      }
      localchu.sBQ = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/chu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
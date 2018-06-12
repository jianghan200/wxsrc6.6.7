package com.tencent.mm.protocal.c;

public final class bao
  extends com.tencent.mm.bk.a
{
  public String lMV;
  public String scW;
  public String scX;
  public String scY;
  public String scZ;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.scW != null) {
        paramVarArgs.g(1, this.scW);
      }
      if (this.scX != null) {
        paramVarArgs.g(2, this.scX);
      }
      if (this.lMV != null) {
        paramVarArgs.g(3, this.lMV);
      }
      if (this.scY != null) {
        paramVarArgs.g(4, this.scY);
      }
      if (this.scZ != null) {
        paramVarArgs.g(5, this.scZ);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.scW == null) {
        break label399;
      }
    }
    label399:
    for (int i = f.a.a.b.b.a.h(1, this.scW) + 0;; i = 0)
    {
      paramInt = i;
      if (this.scX != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.scX);
      }
      i = paramInt;
      if (this.lMV != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.lMV);
      }
      paramInt = i;
      if (this.scY != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.scY);
      }
      i = paramInt;
      if (this.scZ != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.scZ);
      }
      return i;
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
        bao localbao = (bao)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbao.scW = locala.vHC.readString();
          return 0;
        case 2: 
          localbao.scX = locala.vHC.readString();
          return 0;
        case 3: 
          localbao.lMV = locala.vHC.readString();
          return 0;
        case 4: 
          localbao.scY = locala.vHC.readString();
          return 0;
        }
        localbao.scZ = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/bao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
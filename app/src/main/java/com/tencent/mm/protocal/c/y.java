package com.tencent.mm.protocal.c;

public final class y
  extends com.tencent.mm.bk.a
{
  public String kRt;
  public String kRu;
  public String kRv;
  public String kRw;
  public int qYW;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    int i;
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.qYW);
      if (this.kRt != null) {
        paramVarArgs.g(2, this.kRt);
      }
      if (this.kRu != null) {
        paramVarArgs.g(3, this.kRu);
      }
      if (this.kRv != null) {
        paramVarArgs.g(4, this.kRv);
      }
      if (this.kRw != null) {
        paramVarArgs.g(5, this.kRw);
      }
      i = 0;
    }
    do
    {
      return i;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.qYW) + 0;
      paramInt = i;
      if (this.kRt != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.kRt);
      }
      i = paramInt;
      if (this.kRu != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.kRu);
      }
      paramInt = i;
      if (this.kRv != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.kRv);
      }
      i = paramInt;
    } while (this.kRw == null);
    return paramInt + f.a.a.b.b.a.h(5, this.kRw);
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
      y localy = (y)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localy.qYW = locala.vHC.rY();
        return 0;
      case 2: 
        localy.kRt = locala.vHC.readString();
        return 0;
      case 3: 
        localy.kRu = locala.vHC.readString();
        return 0;
      case 4: 
        localy.kRv = locala.vHC.readString();
        return 0;
      }
      localy.kRw = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
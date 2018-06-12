package com.tencent.mm.protocal.c;

public final class ark
  extends com.tencent.mm.bk.a
{
  public String iwF;
  public String rTM;
  public String rTN;
  public String rTO;
  public double rji;
  public double rjj;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    int i;
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.c(1, this.rjj);
      paramVarArgs.c(2, this.rji);
      if (this.iwF != null) {
        paramVarArgs.g(3, this.iwF);
      }
      if (this.rTM != null) {
        paramVarArgs.g(4, this.rTM);
      }
      if (this.rTN != null) {
        paramVarArgs.g(5, this.rTN);
      }
      if (this.rTO != null) {
        paramVarArgs.g(6, this.rTO);
      }
      i = 0;
    }
    do
    {
      return i;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.b.b.a.ec(1) + 8 + 0 + (f.a.a.b.b.a.ec(2) + 8);
      paramInt = i;
      if (this.iwF != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.iwF);
      }
      i = paramInt;
      if (this.rTM != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.rTM);
      }
      paramInt = i;
      if (this.rTN != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rTN);
      }
      i = paramInt;
    } while (this.rTO == null);
    return paramInt + f.a.a.b.b.a.h(6, this.rTO);
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
      ark localark = (ark)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localark.rjj = locala.vHC.readDouble();
        return 0;
      case 2: 
        localark.rji = locala.vHC.readDouble();
        return 0;
      case 3: 
        localark.iwF = locala.vHC.readString();
        return 0;
      case 4: 
        localark.rTM = locala.vHC.readString();
        return 0;
      case 5: 
        localark.rTN = locala.vHC.readString();
        return 0;
      }
      localark.rTO = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/ark.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
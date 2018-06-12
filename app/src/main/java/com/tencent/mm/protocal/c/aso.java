package com.tencent.mm.protocal.c;

public final class aso
  extends com.tencent.mm.bk.a
{
  public String bPS;
  public boolean rUO;
  public boolean rUP;
  public int rUQ;
  public int rUR;
  public String rUS;
  public boolean rUT;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.av(1, this.rUO);
      paramVarArgs.av(2, this.rUP);
      paramVarArgs.fT(3, this.rUQ);
      paramVarArgs.fT(4, this.rUR);
      if (this.rUS != null) {
        paramVarArgs.g(5, this.rUS);
      }
      paramVarArgs.av(6, this.rUT);
      if (this.bPS != null) {
        paramVarArgs.g(7, this.bPS);
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
      i = f.a.a.b.b.a.ec(1) + 1 + 0 + (f.a.a.b.b.a.ec(2) + 1) + f.a.a.a.fQ(3, this.rUQ) + f.a.a.a.fQ(4, this.rUR);
      paramInt = i;
      if (this.rUS != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rUS);
      }
      i = paramInt + (f.a.a.b.b.a.ec(6) + 1);
      paramInt = i;
    } while (this.bPS == null);
    return i + f.a.a.b.b.a.h(7, this.bPS);
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
      aso localaso = (aso)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localaso.rUO = locala.cJQ();
        return 0;
      case 2: 
        localaso.rUP = locala.cJQ();
        return 0;
      case 3: 
        localaso.rUQ = locala.vHC.rY();
        return 0;
      case 4: 
        localaso.rUR = locala.vHC.rY();
        return 0;
      case 5: 
        localaso.rUS = locala.vHC.readString();
        return 0;
      case 6: 
        localaso.rUT = locala.cJQ();
        return 0;
      }
      localaso.bPS = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/aso.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class fs
  extends com.tencent.mm.bk.a
{
  public int rgA;
  public LinkedList<String> rgB = new LinkedList();
  public int rgz;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rgz);
      paramVarArgs.fT(2, this.rgA);
      paramVarArgs.d(3, 1, this.rgB);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.fQ(1, this.rgz) + 0 + f.a.a.a.fQ(2, this.rgA) + f.a.a.a.c(3, 1, this.rgB);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.rgB.clear();
      paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
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
      fs localfs = (fs)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localfs.rgz = locala.vHC.rY();
        return 0;
      case 2: 
        localfs.rgA = locala.vHC.rY();
        return 0;
      }
      localfs.rgB.add(locala.vHC.readString());
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/fs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
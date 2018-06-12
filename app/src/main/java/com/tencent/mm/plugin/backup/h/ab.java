package com.tencent.mm.plugin.backup.h;

import com.tencent.mm.bk.b;

public final class ab
  extends com.tencent.mm.bk.a
{
  public int hbr;
  public b hbs;
  public int hcT;
  public int hcU;
  public long hcV;
  public long hcc;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.hbr);
      if (this.hbs != null) {
        paramVarArgs.b(2, this.hbs);
      }
      paramVarArgs.fT(3, this.hcT);
      paramVarArgs.fT(4, this.hcU);
      paramVarArgs.T(5, this.hcV);
      paramVarArgs.T(6, this.hcc);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = f.a.a.a.fQ(1, this.hbr) + 0;
      paramInt = i;
      if (this.hbs != null) {
        paramInt = i + f.a.a.a.a(2, this.hbs);
      }
      return paramInt + f.a.a.a.fQ(3, this.hcT) + f.a.a.a.fQ(4, this.hcU) + f.a.a.a.S(5, this.hcV) + f.a.a.a.S(6, this.hcc);
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
      ab localab = (ab)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localab.hbr = locala.vHC.rY();
        return 0;
      case 2: 
        localab.hbs = locala.cJR();
        return 0;
      case 3: 
        localab.hcT = locala.vHC.rY();
        return 0;
      case 4: 
        localab.hcU = locala.vHC.rY();
        return 0;
      case 5: 
        localab.hcV = locala.vHC.rZ();
        return 0;
      }
      localab.hcc = locala.vHC.rZ();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/backup/h/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
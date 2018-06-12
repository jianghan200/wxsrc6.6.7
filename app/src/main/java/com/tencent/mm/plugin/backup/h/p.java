package com.tencent.mm.plugin.backup.h;

import f.a.a.b;

public final class p
  extends com.tencent.mm.bk.a
{
  public String ID;
  public long hcc;
  public int hcf;
  public int hcg;
  public int hch;
  public long hci;
  public long hcj;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.ID == null) {
        throw new b("Not all required fields were included: ID");
      }
      if (this.ID != null) {
        paramVarArgs.g(1, this.ID);
      }
      paramVarArgs.fT(2, this.hcf);
      paramVarArgs.fT(3, this.hcg);
      paramVarArgs.fT(4, this.hch);
      paramVarArgs.T(5, this.hcc);
      paramVarArgs.T(6, this.hci);
      paramVarArgs.T(7, this.hcj);
      return 0;
    }
    if (paramInt == 1) {
      if (this.ID == null) {
        break label430;
      }
    }
    label430:
    for (paramInt = f.a.a.b.b.a.h(1, this.ID) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.fQ(2, this.hcf) + f.a.a.a.fQ(3, this.hcg) + f.a.a.a.fQ(4, this.hch) + f.a.a.a.S(5, this.hcc) + f.a.a.a.S(6, this.hci) + f.a.a.a.S(7, this.hcj);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.ID != null) {
          break;
        }
        throw new b("Not all required fields were included: ID");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        p localp = (p)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localp.ID = locala.vHC.readString();
          return 0;
        case 2: 
          localp.hcf = locala.vHC.rY();
          return 0;
        case 3: 
          localp.hcg = locala.vHC.rY();
          return 0;
        case 4: 
          localp.hch = locala.vHC.rY();
          return 0;
        case 5: 
          localp.hcc = locala.vHC.rZ();
          return 0;
        case 6: 
          localp.hci = locala.vHC.rZ();
          return 0;
        }
        localp.hcj = locala.vHC.rZ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/backup/h/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
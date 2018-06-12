package com.tencent.mm.plugin.backup.h;

import f.a.a.b;
import java.util.LinkedList;

public final class r
  extends com.tencent.mm.bk.a
{
  public String ID;
  public long hcc;
  public int hcf;
  public int hcg;
  public int hch;
  public long hci;
  public long hcj;
  public LinkedList<t> hcu = new LinkedList();
  public LinkedList<t> hcv = new LinkedList();
  
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
      paramVarArgs.d(8, 8, this.hcu);
      paramVarArgs.d(9, 8, this.hcv);
      return 0;
    }
    if (paramInt == 1) {
      if (this.ID == null) {
        break label707;
      }
    }
    label707:
    for (paramInt = f.a.a.b.b.a.h(1, this.ID) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.fQ(2, this.hcf) + f.a.a.a.fQ(3, this.hcg) + f.a.a.a.fQ(4, this.hch) + f.a.a.a.S(5, this.hcc) + f.a.a.a.S(6, this.hci) + f.a.a.a.S(7, this.hcj) + f.a.a.a.c(8, 8, this.hcu) + f.a.a.a.c(9, 8, this.hcv);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.hcu.clear();
        this.hcv.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
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
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        r localr = (r)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localr.ID = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localr.hcf = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localr.hcg = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localr.hch = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localr.hcc = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 6: 
          localr.hci = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 7: 
          localr.hcj = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 8: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new t();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((t)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localr.hcu.add(localObject1);
            paramInt += 1;
          }
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        int i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new t();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((t)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localr.hcv.add(localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/backup/h/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
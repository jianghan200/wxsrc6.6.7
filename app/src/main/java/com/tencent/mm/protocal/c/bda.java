package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bda
  extends com.tencent.mm.bk.a
{
  public String cac;
  public int sff;
  public boolean sfg;
  public String sfh;
  public int sfi;
  public int sfj;
  public LinkedList<bcz> sfk = new LinkedList();
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.cac != null) {
        paramVarArgs.g(1, this.cac);
      }
      paramVarArgs.fT(2, this.sff);
      paramVarArgs.av(3, this.sfg);
      if (this.sfh != null) {
        paramVarArgs.g(4, this.sfh);
      }
      paramVarArgs.fT(5, this.sfi);
      paramVarArgs.fT(6, this.sfj);
      paramVarArgs.d(7, 8, this.sfk);
      return 0;
    }
    if (paramInt == 1) {
      if (this.cac == null) {
        break label516;
      }
    }
    label516:
    for (paramInt = f.a.a.b.b.a.h(1, this.cac) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.sff) + (f.a.a.b.b.a.ec(3) + 1);
      paramInt = i;
      if (this.sfh != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.sfh);
      }
      return paramInt + f.a.a.a.fQ(5, this.sfi) + f.a.a.a.fQ(6, this.sfj) + f.a.a.a.c(7, 8, this.sfk);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.sfk.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bda localbda = (bda)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localbda.cac = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localbda.sff = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localbda.sfg = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        case 4: 
          localbda.sfh = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localbda.sfi = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localbda.sfj = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bcz();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((bcz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localbda.sfk.add(localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bda.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class qc
  extends com.tencent.mm.bk.a
{
  public String bHD;
  public String jOS;
  public String jPK;
  public LinkedList<ate> ruA = new LinkedList();
  public int ruB;
  public String ruC;
  public int ruz;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jOS != null) {
        paramVarArgs.g(1, this.jOS);
      }
      paramVarArgs.fT(2, this.ruz);
      if (this.bHD != null) {
        paramVarArgs.g(3, this.bHD);
      }
      if (this.jPK != null) {
        paramVarArgs.g(4, this.jPK);
      }
      paramVarArgs.d(5, 8, this.ruA);
      paramVarArgs.fT(6, this.ruB);
      if (this.ruC != null) {
        paramVarArgs.g(7, this.ruC);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.jOS == null) {
        break label559;
      }
    }
    label559:
    for (paramInt = f.a.a.b.b.a.h(1, this.jOS) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.ruz);
      paramInt = i;
      if (this.bHD != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.bHD);
      }
      i = paramInt;
      if (this.jPK != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.jPK);
      }
      i = i + f.a.a.a.c(5, 8, this.ruA) + f.a.a.a.fQ(6, this.ruB);
      paramInt = i;
      if (this.ruC != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.ruC);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.ruA.clear();
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
        qc localqc = (qc)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localqc.jOS = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localqc.ruz = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localqc.bHD = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localqc.jPK = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new ate();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((ate)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localqc.ruA.add(localObject1);
            paramInt += 1;
          }
        case 6: 
          localqc.ruB = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localqc.ruC = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/qc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
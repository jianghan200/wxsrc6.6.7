package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bbn
  extends bhp
{
  public int rIK;
  public String rmM;
  public int rmN;
  public String rmO;
  public LinkedList<um> sdH = new LinkedList();
  public LinkedList<au> sdI = new LinkedList();
  public int sdJ;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.rIK);
      paramVarArgs.d(3, 8, this.sdH);
      if (this.rmM != null) {
        paramVarArgs.g(4, this.rmM);
      }
      paramVarArgs.fT(5, this.rmN);
      if (this.rmO != null) {
        paramVarArgs.g(6, this.rmO);
      }
      paramVarArgs.d(7, 8, this.sdI);
      paramVarArgs.fT(8, this.sdJ);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label766;
      }
    }
    label766:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rIK) + f.a.a.a.c(3, 8, this.sdH);
      paramInt = i;
      if (this.rmM != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rmM);
      }
      i = paramInt + f.a.a.a.fQ(5, this.rmN);
      paramInt = i;
      if (this.rmO != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rmO);
      }
      return paramInt + f.a.a.a.c(7, 8, this.sdI) + f.a.a.a.fQ(8, this.sdJ);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.sdH.clear();
        this.sdI.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bbn localbbn = (bbn)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbbn.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbbn.rIK = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new um();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((um)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbbn.sdH.add(localObject1);
            paramInt += 1;
          }
        case 4: 
          localbbn.rmM = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localbbn.rmN = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localbbn.rmO = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new au();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((au)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbbn.sdI.add(localObject1);
            paramInt += 1;
          }
        }
        localbbn.sdJ = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bbn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
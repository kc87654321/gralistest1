// ��Ӧ list.gsp ҳ��
def list = {
// �������ֵ��û�еĻ����� 10
params.max=params.max?:3
// ������ʼҳ��û�еĻ����� 0
params.offset=params.offset?:0
// �� offset ��ʼ��ѯ max ��
def goodsList=Goods.list(max:params.max,offset:params.offset)
// ÿ��ҳ����ʾ����Ϊ��ѯ��������
params.total=goodsList.totalCount
// ��ҳ�洫ֵ Map �����ݣ���ʾ������
[goodsList:goodsList, totaler:params.total]
}